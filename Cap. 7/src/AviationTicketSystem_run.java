import ex7_19.AviationTicketSystem;

import java.util.Arrays;
import java.util.Scanner;

public class AviationTicketSystem_run {
    private static boolean[] assentos = new boolean[10]; //10 is arbitrary, the app can use any even value (which the number of first-class seats are the same of the economic-class)
    private static int choice;

    static {
        Arrays.fill(assentos, false);
    }

    public static void main(String[] args) {
        boolean bool = true;
        do {
            Scanner scan = new Scanner(System.in);
            AviationTicketSystem.classIsFull(choice, assentos); //checks if class is full, to switch if so

            System.out.printf("%nInsert 1 for first-class, or 2 for economic.");
            choice = scan.nextInt();

            AviationTicketSystem.afterChoice(choice, assentos);
            AviationTicketSystem.exitIfFull(assentos, bool);
        } while (bool);
    }
}