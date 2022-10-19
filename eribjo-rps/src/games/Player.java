package games;

public class Player {

    //@FIXME: class fields should be declared as private so that they cannot be manipulated from outside
   private int score;

   private String name;

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