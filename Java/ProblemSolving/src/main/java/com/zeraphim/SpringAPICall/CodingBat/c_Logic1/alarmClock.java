package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"

 */

public class alarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }

    private static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = day > 5 || day == 0;
        String alarmMessage = isWeekend ? "10:00" : "7:00";

        if (vacation) {
            alarmMessage = isWeekend ? "off" : "10:00";
        }

        return alarmMessage;
    }

    private static String alarmClockLong(int day, boolean vacation) {
        String[][] schedule = {
                {"10:00", "off"},  // Sunday
                {"7:00", "10:00"}, // Monday
                {"7:00", "10:00"}, // Tuesday
                {"7:00", "10:00"}, // Wednesday
                {"7:00", "10:00"}, // Thursday
                {"7:00", "10:00"}, // Friday
                {"10:00", "off"}   // Saturday
        };
        return schedule[day][vacation ? 1 : 0];
    }

    private static String alarmClockSwitchExpression(int day, boolean vacation) {
        return switch (day) {
            case 0, 6 -> vacation ? "off" : "10:00";
            default -> vacation ? "10:00" : "7:00";
        };
    }
}