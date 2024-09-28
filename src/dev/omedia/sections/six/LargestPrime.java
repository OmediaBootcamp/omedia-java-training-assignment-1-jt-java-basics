package dev.omedia.sections.six;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            for (int i = 2; number > i; i++) {
                while (number > i && number % i == 0) {
                    number = number / i;
                }
            }
            return number;
        }
    }
}
