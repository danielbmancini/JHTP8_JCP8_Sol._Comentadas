package ex7_21;

import java.util.Scanner;

public class ex7_21_run {
    private static Scanner scan = new Scanner(System.in);
    static int returnFloorLenght(){
        System.out.println("Set non-zero positive floor[][] length:");
        int a = scan.nextInt();
        if (a > 0)
            return a;
        else {
            System.out.println("Zero or negative number inserted. floor.length is now 20.");
            return 20;
        }

    }
    public static void main(String[] args) {
        System.out.println("Insert a command:");
        int command = scan.nextInt();
        switch (command) {
            case 1:
                ex7_21.one();
                main(args);
                break;
            case 2:
                ex7_21.two();
                main(args);
                break;
            case 3:
                ex7_21.three();
                main(args);
                break;
            case 4:
                ex7_21.four();
                main(args);
                break;
            case 5: //starts pointing to the right, can go up to 20 blocks
                System.out.println("Input a non negative distance for command '5':");
                int dist = scan.nextInt();
                if (dist >= 0 && dist != 1)
                    ex7_21.five(dist - 1);
                else if (dist != 1) {
                    System.out.println("Can't input negative distance.");
                    main(args);
                    break;
                }
                if (dist == 1)
                    ex7_21.five(1);
                main(args);
                break;
            case 6:
                ex7_21.six();
                main(args);
                break;
            case 9:
                ex7_21.nine();
                break;
        }
    }
}