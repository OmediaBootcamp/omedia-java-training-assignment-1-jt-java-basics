package dev.omedia.sections.five;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return summer ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <= 35;
    }
}
