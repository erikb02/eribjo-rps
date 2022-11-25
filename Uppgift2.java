import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("läg in numer 1");
        int num1 = in.nextInt();

        System.out.println("läg in numer 2");
        int num2 = in.nextInt();

        System.out.println("läg in numer 3");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(" sötrst numer" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(" sötrst numer" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(" sötrst numer" + num3);
        }


    }
}
