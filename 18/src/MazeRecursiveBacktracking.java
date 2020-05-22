import java.util.ArrayList;
import java.util.Arrays;

public class MazeRecursiveBacktracking {
    private static final int N = 12; //length of maze
    private static final char[][] mazeArray = new char[N][N];
    private static int[] initialPosition; //the maze's entrance
    private static int[] finalPosition; //the maze's exit on the right
    private static final ArrayList<Integer[]> path = new ArrayList<>();

    public static void main(String[] args) {
        String mazeString = "# # # # # # # # # # # #" +
                "# . . . # . . . . . . #" +
                ". . # . # . # # # # . #" +
                "# # # . # . . . . # . #" +
                "# . . . . # # # . # . ." +
                "# # # # . # . # . # . #" +
                "# . . # . # . # . # . #" +
                "# # . # . # . # . # . #" +
                "# . . . . . . . . # . #" +
                "# # # # # # . # # # . #" +
                "# . . . . . . # . . . #" +
                "# # # # # # # # # # # #";

        processMazeString(mazeString);
        initialPosition = new int[]{2, 0};
        finalPosition = new int[]{4, 11};

        mazeTraversal(initialPosition[0], initialPosition[1], 0);
        processMazeString(mazeString); //resetting mazeArray
        printFinalPath();
    }

    private static void processMazeString(String string) {
        string = string.replaceAll(" ", "");

        int a = 0;
        for (int i = 0; i < string.length(); i++) {
            int b = i % N; //b loops 0 through N - 1 as needed
            mazeArray[a][b] = string.charAt(i);
            a = b == N - 1 ? a + 1 : a; //a loops every time an array is filled (b + 1 mod N is 0)
        }
    }

    private static void printMazeArray() {
        System.out.println();
        for (char[] array : mazeArray)
            System.out.println(Arrays.toString(array)
                    .replaceAll("[\\[\\],]", ""));
    }

    private static boolean mazeTraversal(int a, int b, int thisDirection) {
        try {
            if (mazeArray[a][b] != '.')
                return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        mazeArray[a][b] = '*';
        printMazeArray();
        mazeArray[a][b] = '.';

        if (a == initialPosition[0] && b == initialPosition[1])
            mazeArray[a][b] = '#';
        Integer[] position = new Integer[]{a, b};
        path.add(position);
        if (a == finalPosition[0] && b == finalPosition[1]) return true;

        if (thisDirection != 3) //do not revert direction for no reason
            if (mazeTraversal(a, b + 1, 1)) //going right
                return true;
        if (thisDirection != 4)
            if (mazeTraversal(a + 1, b, 2)) //going down
                return true;
        if (thisDirection != 1)
            if (mazeTraversal(a, b - 1, 3)) //going left
                return true;
        if (thisDirection != 2)
            if (mazeTraversal(a - 1, b, 4)) //going up
                return true;

        path.remove(position);
        mazeArray[a][b] = 'O';
        return false;
    }

    private static void printFinalPath() {
        System.out.println("Final path:");

        path.forEach(tuple -> mazeArray[tuple[0]][tuple[1]] = '*');

        printMazeArray();
        System.out.printf("%nNumber of path 2-tuples: %d%n", path.size());
    }
}
