package dev.omedia.sections.six;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = number;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            return firstDigit + lastDigit;
        }
    }
}
