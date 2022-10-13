package games;

public class Player {
    int score;

    String name;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;


    }

    public String toString() {
        return "Neme:" + this.name + "Score:" + this.score;
    }
    //public void rageQiut() {

    //  System.exit(0);
    // }
}