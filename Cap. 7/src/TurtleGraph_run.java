import ex7_21.TurtleGraph;

import java.util.Scanner;

/*
    Exercise 7.21 main class
 */
public class TurtleGraph_run {
    private static Scanner scan = new Scanner(System.in);

    public static int returnFloorLength() {
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
        int command;
        TurtleGraph turtleGraph = new TurtleGraph(returnFloorLength());
        do {
            System.out.println("Insert a command:");
            command = scan.nextInt();
            switch (command) {
                case 1:
                    turtleGraph.one();
                    break;
                case 2:
                    turtleGraph.two();
                    break;
                case 3:
                    turtleGraph.three();
                    break;
                case 4:
                    turtleGraph.four();
                    break;
                case 5: //starts pointing to the right, can go up to 20 blocks
                    System.out.println("Input a non negative distance for command '5':");
                    int dist = scan.nextInt();
                    if (dist >= 0 && dist != 1)
                        turtleGraph.five(dist - 1);
                    else if (dist != 1) {
                        System.out.println("Can't input negative distance.");
                        break;
                    }
                    if (dist == 1)
                        turtleGraph.five(1);
                    break;
                case 6:
                    turtleGraph.six();
                    break;
            }
        } while (command != 9);
    }
}