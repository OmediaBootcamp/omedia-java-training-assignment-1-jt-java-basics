package dev.omedia.sections.six;

public class FlourPacker {
    private static final int WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int bigCountWeight = bigCount * WEIGHT;
            int remaining = goal % WEIGHT;

            return bigCountWeight >= goal ? smallCount >= remaining : smallCount >= goal - bigCountWeight;
        }
    }
}
