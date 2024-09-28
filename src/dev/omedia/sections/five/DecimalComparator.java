package dev.omedia.sections.five;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        return (long) (numberOne * 1000) == (long) (numberTwo * 1000);
    }
}
