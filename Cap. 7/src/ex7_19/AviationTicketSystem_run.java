package ex7_19;

import java.util.Arrays;
import java.util.Scanner;

public class AviationTicketSystem_run {
    private static boolean[] assentos = new boolean[10]; //10 is arbitrary, the app can use any even value (which the number of first-class seats are the same of the economic-class)
    private static int choice;

    static {
        Arrays.fill(assentos, false);
    }

    public static void main(String[] args) { //main 'ends' when the ex7_19.exitIfFull if condition is true
        Scanner scan = new Scanner(System.in);
        AviationTicketSystem.exitIfFull(assentos);
        AviationTicketSystem.classIsFull(choice, assentos); //checks if class is full, to switch if so

        System.out.printf("%nInsert 1 for first-class, or 2 for economic.");
        choice = scan.nextInt();

        AviationTicketSystem.afterChoice(choice, assentos);
        main(args);

    }
}