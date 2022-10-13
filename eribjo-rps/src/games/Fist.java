package games;

import java.util.Random;

public class Fist {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    private Random random;

    Fist() {
        random = new Random();
    }

    //
    public int Play() {
        Random FistRandom = new Random();
        int result = FistRandom.nextInt(3);
        return result;
    }
}
