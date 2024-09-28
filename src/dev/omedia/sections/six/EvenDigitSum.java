package dev.omedia.sections.six;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int evenNumberSum = 0;
            int num = number;

            while (num > 0) {
                int lastDigit = num % 10;
                if (lastDigit % 2 == 0) {
                    evenNumberSum += lastDigit;
                }
                num /= 10;
            }

            return evenNumberSum;
        }
    }
}
