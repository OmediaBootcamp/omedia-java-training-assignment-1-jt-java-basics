package dev.omedia.sections.five;

public class MinutesToYearsDaysCalculator {
    private static final int MIN = 60;
    private static final int HOURS = 24;
    private static final int DAYS = 365;
    private static final int DAY_MIN = HOURS * MIN;
    private static final int YEAR_MIN = MIN * HOURS * DAYS;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / YEAR_MIN;
            long days = (minutes / DAY_MIN) % DAYS;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
