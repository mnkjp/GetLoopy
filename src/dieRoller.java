import java.util.Random;
import java.util.Scanner;

public class dieRoller {
    public static void main(String[] args) {
        Random gen = new Random();

        int die1 = 0;
        int die2 = -1;
        int die3 = -2;
        int dieSum = 0;
        int roll = 0;
        String input = "";
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        do {

            System.out.println("roll\tdie1\tdie2\tdie3\tdieRoll");
            System.out.println("------------------------------------------");

            do {
                roll = roll + 1;
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieSum = die1 + die2 + die3;

                System.out.printf("%6d\t%6d\t%6d\t%6d\t%6d\n", roll, die1, die2, die3, dieSum);

            } while (!(die1 == die2 && die2 == die3));
            System.out.println("Would you like to roll again? (y/n)");
             input = scan.nextLine();
             if (input.equalsIgnoreCase("n")) {done = true;}

        }while(!done);
    }

}


