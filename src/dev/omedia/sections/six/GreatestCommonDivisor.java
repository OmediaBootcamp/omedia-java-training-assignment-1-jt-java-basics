package dev.omedia.sections.six;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int greatestCommonDivisor = 1;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
    }
}
