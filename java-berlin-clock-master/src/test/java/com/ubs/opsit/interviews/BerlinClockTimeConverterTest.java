package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockTimeConverterTest {

    private BerlinClockTimeConverter timeConverter;

    @Before
    public void init(){
        timeConverter = new BerlinClockTimeConverter();
    }

    @Test
    public void testSecondLedOnOffEveryTwoSeconds() {
        Assert.assertEquals("Y", timeConverter.getSeconds(0));
        Assert.assertEquals("O", timeConverter.getSeconds(1));
        Assert.assertEquals("Y", timeConverter.getSeconds(2));
        Assert.assertEquals("O", timeConverter.getSeconds(3));
        Assert.assertEquals("Y", timeConverter.getSeconds(4));
        Assert.assertEquals("O", timeConverter.getSeconds(5));
        Assert.assertEquals("Y", timeConverter.getSeconds(6));
        Assert.assertEquals("O", timeConverter.getSeconds(7));
        Assert.assertEquals("Y", timeConverter.getSeconds(8));
        Assert.assertEquals("O", timeConverter.getSeconds(9));
        Assert.assertEquals("Y", timeConverter.getSeconds(10));
        Assert.assertEquals("O", timeConverter.getSeconds(11));
        Assert.assertEquals("Y", timeConverter.getSeconds(12));
        Assert.assertEquals("O", timeConverter.getSeconds(13));
        Assert.assertEquals("Y", timeConverter.getSeconds(14));
        Assert.assertEquals("O", timeConverter.getSeconds(15));
        Assert.assertEquals("Y", timeConverter.getSeconds(16));
        Assert.assertEquals("O", timeConverter.getSeconds(17));
        Assert.assertEquals("Y", timeConverter.getSeconds(18));
        Assert.assertEquals("O", timeConverter.getSeconds(19));
        Assert.assertEquals("Y", timeConverter.getSeconds(20));
        Assert.assertEquals("O", timeConverter.getSeconds(21));
        Assert.assertEquals("Y", timeConverter.getSeconds(22));
        Assert.assertEquals("O", timeConverter.getSeconds(23));
        Assert.assertEquals("Y", timeConverter.getSeconds(24));
        Assert.assertEquals("O", timeConverter.getSeconds(25));
        Assert.assertEquals("Y", timeConverter.getSeconds(26));
        Assert.assertEquals("O", timeConverter.getSeconds(27));
        Assert.assertEquals("Y", timeConverter.getSeconds(28));
        Assert.assertEquals("O", timeConverter.getSeconds(29));
        Assert.assertEquals("Y", timeConverter.getSeconds(30));
        Assert.assertEquals("O", timeConverter.getSeconds(31));
        Assert.assertEquals("Y", timeConverter.getSeconds(32));
        Assert.assertEquals("O", timeConverter.getSeconds(33));
        Assert.assertEquals("Y", timeConverter.getSeconds(34));
        Assert.assertEquals("O", timeConverter.getSeconds(35));
        Assert.assertEquals("Y", timeConverter.getSeconds(36));
        Assert.assertEquals("O", timeConverter.getSeconds(37));
        Assert.assertEquals("Y", timeConverter.getSeconds(38));
        Assert.assertEquals("O", timeConverter.getSeconds(39));
        Assert.assertEquals("Y", timeConverter.getSeconds(40));
        Assert.assertEquals("O", timeConverter.getSeconds(41));
        Assert.assertEquals("Y", timeConverter.getSeconds(42));
        Assert.assertEquals("O", timeConverter.getSeconds(43));
        Assert.assertEquals("Y", timeConverter.getSeconds(44));
        Assert.assertEquals("O", timeConverter.getSeconds(45));
        Assert.assertEquals("Y", timeConverter.getSeconds(46));
        Assert.assertEquals("O", timeConverter.getSeconds(47));
        Assert.assertEquals("Y", timeConverter.getSeconds(48));
        Assert.assertEquals("O", timeConverter.getSeconds(49));
        Assert.assertEquals("Y", timeConverter.getSeconds(50));
        Assert.assertEquals("O", timeConverter.getSeconds(51));
        Assert.assertEquals("Y", timeConverter.getSeconds(52));
        Assert.assertEquals("O", timeConverter.getSeconds(53));
        Assert.assertEquals("Y", timeConverter.getSeconds(54));
        Assert.assertEquals("O", timeConverter.getSeconds(55));
        Assert.assertEquals("Y", timeConverter.getSeconds(56));
        Assert.assertEquals("O", timeConverter.getSeconds(57));
        Assert.assertEquals("Y", timeConverter.getSeconds(58));
        Assert.assertEquals("O", timeConverter.getSeconds(59));
    }

    @Test
    public void testUpperHoursRowLedOnOff() {
        Assert.assertEquals(4, timeConverter.getUpperHoursRow(11).length());

        Assert.assertEquals("OOOO", timeConverter.getUpperHoursRow(0));
        Assert.assertEquals("OOOO", timeConverter.getUpperHoursRow(1));
        Assert.assertEquals("OOOO", timeConverter.getUpperHoursRow(2));
        Assert.assertEquals("OOOO", timeConverter.getUpperHoursRow(3));
        Assert.assertEquals("OOOO", timeConverter.getUpperHoursRow(4));
        Assert.assertEquals("ROOO", timeConverter.getUpperHoursRow(5));
        Assert.assertEquals("ROOO", timeConverter.getUpperHoursRow(6));
        Assert.assertEquals("ROOO", timeConverter.getUpperHoursRow(7));
        Assert.assertEquals("ROOO", timeConverter.getUpperHoursRow(8));
        Assert.assertEquals("ROOO", timeConverter.getUpperHoursRow(9));
        Assert.assertEquals("RROO", timeConverter.getUpperHoursRow(10));
        Assert.assertEquals("RROO", timeConverter.getUpperHoursRow(11));
        Assert.assertEquals("RROO", timeConverter.getUpperHoursRow(12));
        Assert.assertEquals("RROO", timeConverter.getUpperHoursRow(13));
        Assert.assertEquals("RROO", timeConverter.getUpperHoursRow(14));
        Assert.assertEquals("RRRO", timeConverter.getUpperHoursRow(15));
        Assert.assertEquals("RRRO", timeConverter.getUpperHoursRow(16));
        Assert.assertEquals("RRRO", timeConverter.getUpperHoursRow(17));
        Assert.assertEquals("RRRO", timeConverter.getUpperHoursRow(18));
        Assert.assertEquals("RRRO", timeConverter.getUpperHoursRow(19));
        Assert.assertEquals("RRRR", timeConverter.getUpperHoursRow(20));
        Assert.assertEquals("RRRR", timeConverter.getUpperHoursRow(21));
        Assert.assertEquals("RRRR", timeConverter.getUpperHoursRow(22));
        Assert.assertEquals("RRRR", timeConverter.getUpperHoursRow(23));
    }

    @Test
    public void testBottomHoursRowLedOnOff() {
        Assert.assertEquals(4, timeConverter.getBottomHoursRow(1).length());

        Assert.assertEquals("OOOO", timeConverter.getBottomHoursRow(0));
        Assert.assertEquals("ROOO", timeConverter.getBottomHoursRow(1));
        Assert.assertEquals("RROO", timeConverter.getBottomHoursRow(2));
        Assert.assertEquals("RRRO", timeConverter.getBottomHoursRow(3));
        Assert.assertEquals("RRRR", timeConverter.getBottomHoursRow(4));
        Assert.assertEquals("OOOO", timeConverter.getBottomHoursRow(5));
        Assert.assertEquals("ROOO", timeConverter.getBottomHoursRow(6));
        Assert.assertEquals("RROO", timeConverter.getBottomHoursRow(7));
        Assert.assertEquals("RRRO", timeConverter.getBottomHoursRow(8));
        Assert.assertEquals("RRRR", timeConverter.getBottomHoursRow(9));
        Assert.assertEquals("OOOO", timeConverter.getBottomHoursRow(10));
        Assert.assertEquals("ROOO", timeConverter.getBottomHoursRow(11));
        Assert.assertEquals("RROO", timeConverter.getBottomHoursRow(12));
        Assert.assertEquals("RRRO", timeConverter.getBottomHoursRow(13));
        Assert.assertEquals("RRRR", timeConverter.getBottomHoursRow(14));
        Assert.assertEquals("OOOO", timeConverter.getBottomHoursRow(15));
        Assert.assertEquals("ROOO", timeConverter.getBottomHoursRow(16));
        Assert.assertEquals("RROO", timeConverter.getBottomHoursRow(17));
        Assert.assertEquals("RRRO", timeConverter.getBottomHoursRow(18));
        Assert.assertEquals("RRRR", timeConverter.getBottomHoursRow(19));
        Assert.assertEquals("OOOO", timeConverter.getBottomHoursRow(20));
        Assert.assertEquals("ROOO", timeConverter.getBottomHoursRow(21));
        Assert.assertEquals("RROO", timeConverter.getBottomHoursRow(22));
        Assert.assertEquals("RRRO", timeConverter.getBottomHoursRow(23));
    }

    @Test
    public void testUpperMinutesRowLedOnOff() {
        Assert.assertEquals("OOOOOOOOOOO", timeConverter.getUpperMinutesRow(0));
        Assert.assertEquals("OOOOOOOOOOO", timeConverter.getUpperMinutesRow(1));
        Assert.assertEquals("OOOOOOOOOOO", timeConverter.getUpperMinutesRow(2));
        Assert.assertEquals("OOOOOOOOOOO", timeConverter.getUpperMinutesRow(3));
        Assert.assertEquals("OOOOOOOOOOO", timeConverter.getUpperMinutesRow(4));
        Assert.assertEquals("YOOOOOOOOOO", timeConverter.getUpperMinutesRow(5));
        Assert.assertEquals("YOOOOOOOOOO", timeConverter.getUpperMinutesRow(6));
        Assert.assertEquals("YOOOOOOOOOO", timeConverter.getUpperMinutesRow(7));
        Assert.assertEquals("YOOOOOOOOOO", timeConverter.getUpperMinutesRow(8));
        Assert.assertEquals("YOOOOOOOOOO", timeConverter.getUpperMinutesRow(9));
        Assert.assertEquals("YYOOOOOOOOO", timeConverter.getUpperMinutesRow(10));
        Assert.assertEquals("YYOOOOOOOOO", timeConverter.getUpperMinutesRow(11));
        Assert.assertEquals("YYOOOOOOOOO", timeConverter.getUpperMinutesRow(12));
        Assert.assertEquals("YYOOOOOOOOO", timeConverter.getUpperMinutesRow(13));
        Assert.assertEquals("YYOOOOOOOOO", timeConverter.getUpperMinutesRow(14));
        Assert.assertEquals("YYROOOOOOOO", timeConverter.getUpperMinutesRow(15));
        Assert.assertEquals("YYROOOOOOOO", timeConverter.getUpperMinutesRow(16));
        Assert.assertEquals("YYROOOOOOOO", timeConverter.getUpperMinutesRow(17));
        Assert.assertEquals("YYROOOOOOOO", timeConverter.getUpperMinutesRow(18));
        Assert.assertEquals("YYROOOOOOOO", timeConverter.getUpperMinutesRow(19));
        Assert.assertEquals("YYRYOOOOOOO", timeConverter.getUpperMinutesRow(20));
        Assert.assertEquals("YYRYOOOOOOO", timeConverter.getUpperMinutesRow(21));
        Assert.assertEquals("YYRYOOOOOOO", timeConverter.getUpperMinutesRow(22));
        Assert.assertEquals("YYRYOOOOOOO", timeConverter.getUpperMinutesRow(23));
        Assert.assertEquals("YYRYOOOOOOO", timeConverter.getUpperMinutesRow(24));
        Assert.assertEquals("YYRYYOOOOOO", timeConverter.getUpperMinutesRow(25));
        Assert.assertEquals("YYRYYOOOOOO", timeConverter.getUpperMinutesRow(26));
        Assert.assertEquals("YYRYYOOOOOO", timeConverter.getUpperMinutesRow(27));
        Assert.assertEquals("YYRYYOOOOOO", timeConverter.getUpperMinutesRow(28));
        Assert.assertEquals("YYRYYOOOOOO", timeConverter.getUpperMinutesRow(29));
        Assert.assertEquals("YYRYYROOOOO", timeConverter.getUpperMinutesRow(30));
        Assert.assertEquals("YYRYYROOOOO", timeConverter.getUpperMinutesRow(31));
        Assert.assertEquals("YYRYYROOOOO", timeConverter.getUpperMinutesRow(32));
        Assert.assertEquals("YYRYYROOOOO", timeConverter.getUpperMinutesRow(33));
        Assert.assertEquals("YYRYYROOOOO", timeConverter.getUpperMinutesRow(34));
        Assert.assertEquals("YYRYYRYOOOO", timeConverter.getUpperMinutesRow(35));
        Assert.assertEquals("YYRYYRYOOOO", timeConverter.getUpperMinutesRow(36));
        Assert.assertEquals("YYRYYRYOOOO", timeConverter.getUpperMinutesRow(37));
        Assert.assertEquals("YYRYYRYOOOO", timeConverter.getUpperMinutesRow(38));
        Assert.assertEquals("YYRYYRYOOOO", timeConverter.getUpperMinutesRow(39));
        Assert.assertEquals("YYRYYRYYOOO", timeConverter.getUpperMinutesRow(40));
        Assert.assertEquals("YYRYYRYYOOO", timeConverter.getUpperMinutesRow(41));
        Assert.assertEquals("YYRYYRYYOOO", timeConverter.getUpperMinutesRow(42));
        Assert.assertEquals("YYRYYRYYOOO", timeConverter.getUpperMinutesRow(43));
        Assert.assertEquals("YYRYYRYYOOO", timeConverter.getUpperMinutesRow(44));
        Assert.assertEquals("YYRYYRYYROO", timeConverter.getUpperMinutesRow(45));
        Assert.assertEquals("YYRYYRYYROO", timeConverter.getUpperMinutesRow(46));
        Assert.assertEquals("YYRYYRYYROO", timeConverter.getUpperMinutesRow(47));
        Assert.assertEquals("YYRYYRYYROO", timeConverter.getUpperMinutesRow(48));
        Assert.assertEquals("YYRYYRYYROO", timeConverter.getUpperMinutesRow(49));
        Assert.assertEquals("YYRYYRYYRYO", timeConverter.getUpperMinutesRow(50));
        Assert.assertEquals("YYRYYRYYRYO", timeConverter.getUpperMinutesRow(51));
        Assert.assertEquals("YYRYYRYYRYO", timeConverter.getUpperMinutesRow(52));
        Assert.assertEquals("YYRYYRYYRYO", timeConverter.getUpperMinutesRow(53));
        Assert.assertEquals("YYRYYRYYRYO", timeConverter.getUpperMinutesRow(54));
        Assert.assertEquals("YYRYYRYYRYY", timeConverter.getUpperMinutesRow(55));
        Assert.assertEquals("YYRYYRYYRYY", timeConverter.getUpperMinutesRow(56));
        Assert.assertEquals("YYRYYRYYRYY", timeConverter.getUpperMinutesRow(57));
        Assert.assertEquals("YYRYYRYYRYY", timeConverter.getUpperMinutesRow(58));
        Assert.assertEquals("YYRYYRYYRYY", timeConverter.getUpperMinutesRow(59));
    }

    @Test
    public void testBottomMinutesRowLedOnOff() {
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(0));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(1));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(2));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(3));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(4));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(5));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(6));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(7));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(8));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(9));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(10));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(11));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(12));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(13));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(14));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(15));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(16));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(17));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(18));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(19));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(20));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(21));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(22));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(23));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(24));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(25));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(26));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(27));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(28));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(29));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(30));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(31));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(32));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(33));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(34));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(35));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(36));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(37));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(38));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(39));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(40));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(41));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(42));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(43));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(44));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(45));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(46));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(47));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(48));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(49));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(50));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(51));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(52));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(53));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(54));
        Assert.assertEquals("OOOO", timeConverter.getBottomMinutesRow(55));
        Assert.assertEquals("YOOO", timeConverter.getBottomMinutesRow(56));
        Assert.assertEquals("YYOO", timeConverter.getBottomMinutesRow(57));
        Assert.assertEquals("YYYO", timeConverter.getBottomMinutesRow(58));
        Assert.assertEquals("YYYY", timeConverter.getBottomMinutesRow(59));
    }
}
