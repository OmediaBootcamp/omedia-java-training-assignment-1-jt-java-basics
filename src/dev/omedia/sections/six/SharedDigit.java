package dev.omedia.sections.six;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (!(a >= 10 && a <= 99) || !(b >= 10 && b <= 99)) {
            return false;
        } else {
            int firstLeft = a / 10;
            int firstRight = a % 10;
            int secondLeft = b / 10;
            int secondRight = b % 10;

            return firstLeft == secondLeft || firstLeft == secondRight || firstRight == secondLeft || firstRight == secondRight;
        }
    }
}
