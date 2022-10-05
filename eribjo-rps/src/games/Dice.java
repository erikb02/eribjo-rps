package games;

import java.util.Random;

public class Dice {


    public int num0fSides;

    public Dice(int num0fSides){
        this.num0fSides = num0fSides;
    }
    public int roll() {
        Random diceRandom = new Random();
        //Scanner diceScanner = new Scanner(System.in);
        int result = diceRandom.nextInt(num0fSides)+1;


         return result;

    }
}
