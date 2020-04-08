package ex7_19;

import java.util.Scanner;

public class AviationTicketSystem {

    private static Scanner scan = new Scanner(System.in);
    private static int classIsFullUsage = 0;

    public static void exitIfFull(boolean[] assentos, boolean bool) { //exits when the plane is full
        if (assentos[(assentos.length / 2) - 1] && assentos[assentos.length - 1]) //if the last seat of both classes are occupied
        {
            System.out.println("\nThe plane is full.");
            System.exit(0);
            bool = false;
        }
    }

    public static void afterChoice(int choice, boolean[] assentos) {
        for (int i = 0; i < assentos.length; i++) {
            if (choice == 1 && i < assentos.length / 2 && !assentos[i]) //se a primeira classe é a referida por choice
            {
                System.out.printf("%nHave a good flight - your seat is n. %d%n", i + 1);
                assentos[i] = true;
                break;
            } else if (choice == 2 && i >= assentos.length / 2 && !assentos[i]) {
                System.out.printf("%nHave a good flight - your seat is n. %d%n", i + 1);
                assentos[i] = true;
                break;
            }
        }
    }

    public static void classIsFull(int choice, boolean[] transfer) {
        String choice2;
        exitIfFull(transfer, true);


        if ((choice == 1 && transfer[(transfer.length / 2) - 1] && classIsFullUsage != 1) ||
                (choice == 2 && transfer[transfer.length - 1] && classIsFullUsage != 1)) { //haja uso de condições
            System.out.println("\nthe chosen class is full. do you wish to be in the other one, instead? (y/n)"); //i won't tweak to make it say the converse flight class
            choice2 = scan.nextLine();
            if (choice2.equals("y")) {
                switch (choice) {
                    case 1:
                        choice = 2;
                        break;
                    case 2:
                        choice = 1;
                        break;
                }
                afterChoice(choice, transfer);
            } else if (choice2.equals("n"))
                System.out.println("\nNext flight departs in 3 hours.");
        }
        if (transfer[(transfer.length / 2) - 2] || transfer[transfer.length-2]) //indirectly prevents classIsFull from being called when the last seat of each class is being occupied
            classIsFullUsage++;
    }
}