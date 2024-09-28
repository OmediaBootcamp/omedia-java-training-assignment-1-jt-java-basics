package dev.omedia.sections.six;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        } else {
            int firstRight = a % 10;
            int secondRight = b % 10;
            int thirdRight = c % 10;
            return firstRight == secondRight || firstRight == thirdRight || secondRight == thirdRight;
        }

    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
