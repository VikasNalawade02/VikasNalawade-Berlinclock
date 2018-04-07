package com.ubs.opsit.interviews;

import java.util.stream.Stream;

public class BerlinClockTimeConverter implements TimeConverter {

    private final String OFF_LED = "O";
    private final String YELLOW_LED = "Y";
    private final String RED_LED = "R";


    public String convertTime(String aTime) {
        int[] parts = Stream.of(aTime.split(":"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        StringBuilder berlineTime =
                new StringBuilder()
                        .append(getSeconds(parts[2])).append(System.lineSeparator())
                        .append(getUpperHoursRow(parts[0])).append(System.lineSeparator())
                        .append(getBottomHoursRow(parts[0])).append(System.lineSeparator())
                        .append(getUpperMinutesRow(parts[1])).append(System.lineSeparator())
                        .append(getBottomMinutesRow(parts[1]));

        return berlineTime.toString();
    }

    protected String getSeconds(int number) {
        if (number % 2 == 0) {
            return "Y";
        } else {
            return "O";
        }
    }

    protected String getUpperHoursRow(int number) {
        return getOnOffLeds(4, number / 5,RED_LED);
    }

    protected String getBottomHoursRow(int number) {
        return getOnOffLeds(4, number % 5,RED_LED);
    }

    protected String getUpperMinutesRow(int number) {
        int onLeds = number/5;
        String out = "";
        //Get On LEDS
        out = getUpperMinutesOnLamps(onLeds,out);
        //GET OFF LEDS
        out = getLamps(11 - onLeds, OFF_LED, out);
        return out;
    }

    protected String getBottomMinutesRow(int number) {
        return getOnOffLeds(4, number % 5, YELLOW_LED);
    }

    private String getOnOffLeds(int noOfLeds, int onLeds, String ledType) {
        String out = "";
        //Get On Lamps
        out = getLamps(onLeds, ledType, out);
        //Get Off Lamps
        out = getLamps((noOfLeds - onLeds), OFF_LED, out);
        return out;
    }


    private String getLamps(int leds,  String ledType, String out) {
        for (int i = 0; i < leds; i++) {
            out += ledType;
        }
        return out;
    }

    private String getUpperMinutesOnLamps(int leds, String out) {
        for (int i = 1; i <= leds; i++) {
            if(i % 3 == 0){
                out += RED_LED;
            } else {
                out += YELLOW_LED;
            }
        }
        return out;
    }
}

