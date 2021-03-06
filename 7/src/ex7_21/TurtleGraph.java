package ex7_21;

import java.util.Arrays;

public class TurtleGraph {
    private int floorLength;
    private boolean pen_state;
    private int[] current_block = {0, 0}; //should be valued at most (19,19)
    private Integer direction = 1; // from a same frame of reference, 0: up, 1: right, 2: down, 3: left
    private int[][] floor;

    public TurtleGraph(int length) {
        super();
        floorLength = length;
        fillFloor();
    }

    private void fillFloor() {
        floor = new int[floorLength][floorLength];
        for (int i = 0; i < floorLength; i++)
            Arrays.fill(floor[i], 0);
    }


    private void fillFloor(int i, int j) {
        switch (direction) {
            case 0:
                while (i <= j) {
                    floor[j][current_block[1]] = 1;
                    j--;
                }
                break;
            case 1:
                while (i >= j) {
                    floor[current_block[0]][j] = 1;
                    j++;
                }
                break;
            case 2:
                while (i >= j) {
                    floor[j][current_block[1]] = 1;
                    j++;
                }
                break;
            case 3:
                while (j >= i) {
                    floor[current_block[0]][j] = 1;
                    j--;
                }
        }
    }

    public void one() {
        pen_state = false;
    }

    public void two() {
        pen_state = true;
    }

    public void three()//right
    {
        if (direction == 3)
            direction = 0;
        else {
            if (direction == 0)
                direction = 1;
            else if (direction < 3)
                direction++;
        }
    }

    public void four()//left
    {
        if (direction == 0)
            direction = 3;
        else if (direction > 0)
            direction--;
    }

    public void five(int distance) //convoluted
    {
        switch (direction) {
            case 0:
                if (current_block[0] - distance >= 0) {
                    int storeCurrentBlock = current_block[0];
                    current_block[0] += -distance;
                    if (pen_state)
                        fillFloor(current_block[0], storeCurrentBlock);
                } else System.out.println("Can't go up!");
                break;
            case 1:
                if (current_block[1] + distance <= floorLength - 1) {
                    int storeCurrentBlock1 = current_block[1];
                    current_block[1] += distance;
                    if (pen_state)
                        fillFloor(current_block[1], storeCurrentBlock1);
                } else if (distance >= floorLength)
                    if (!(current_block[1] + distance <= floorLength - 2))
                        System.out.println("Can't go to the right!");
                break;
            case 2:
                if (current_block[0] + distance <= floorLength - 1) {
                    int storeCurrentBlock = current_block[0];
                    current_block[0] += distance;
                    if (pen_state)
                        fillFloor(current_block[0], storeCurrentBlock);
                } else System.out.println("Can't go down!");
                break;
            case 3:
                if (current_block[1] - distance >= 0) {
                    int storeCurrentBlock1 = current_block[1];
                    current_block[1] += -distance;
                    if (pen_state)
                        fillFloor(current_block[1], storeCurrentBlock1);
                } else if (current_block[0] == 0)
                    System.out.println("Can't go to the left!");
                break;
        }
    }

    public void six() {
        for (int i = 0; i < floorLength; i++)
            for (int j = 0; j < floor[i].length; j++) {
                System.out.print(floor[i][j] + "  ");
                if (j == floor[i].length - 1)
                    System.out.println("\n");
            }
    }

}