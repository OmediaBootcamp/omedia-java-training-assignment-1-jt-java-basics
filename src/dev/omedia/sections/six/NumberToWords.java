package dev.omedia.sections.six;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);

        int varnishedZeros = getDigitCount(number) - getDigitCount(reversedNumber);

        do {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        } while (reversedNumber != 0);

        for (int i = 0; i < varnishedZeros; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        return number < 0 ? -1 : String.valueOf(number).length();
    }
}

