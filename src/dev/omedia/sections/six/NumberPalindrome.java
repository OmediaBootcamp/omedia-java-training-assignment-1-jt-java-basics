package dev.omedia.sections.six;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int rev = 0;
        int num = number;

        while (num != 0) {
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }

        return number == rev;
    }
}
