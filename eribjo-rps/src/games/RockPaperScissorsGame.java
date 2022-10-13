package games;

import java.util.Scanner;

public class RockPaperScissorsGame {

    Player gamer;

    Fist aiFist;

    RockPaperScissorsGame(String playerName, int playerScore) {
        gamer = new Player(playerName, playerScore);
        aiFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("Spamton", 0);
        game.playGame();
    }

    //@TODO: public, private or protected?
     private void playGame() {
        System.out.println(gamer.getName());
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        for (int i = 0; i < 3; i++) {

            int hand = aiFist.Play();

            System.out.println("Rock(0) Paper(1) Scissors(2)");
            choice = scanner.nextInt();
            if (choice == hand) {
                System.out.println("It's a draw");
                System.out.println(" You chose " + choice + " computer chose " + hand);
            } else if (choice == Fist.ROCK && hand == Fist.SCISSORS) {
                System.out.println("You Win");
                System.out.println(" You chose " + choice + " computer chose " + hand);
            } else if (choice == Fist.PAPER && hand == Fist.ROCK) {
                System.out.println("You win");
                System.out.println(" You chose " + choice + " computer chose " + hand);
            } else if (choice == Fist.SCISSORS && hand == Fist.PAPER) {
                System.out.println("You win");
                System.out.println(" You chose " + choice + " computer chose " + hand);
            } else {
                System.out.println("You lose");
                System.out.println(" You chose " + choice + " computer chose " + hand);
            }
        }
    }
}