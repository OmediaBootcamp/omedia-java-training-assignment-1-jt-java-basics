package dev.omedia.sections.six;

public class SumOddRange {
    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }

            }
            return sum;
        }
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else {
            return number % 2 != 0;
        }
    }
}
