import java.util.Arrays;

public class MazeRecursiveBacktracking {

    private static final char[][] mazeArray = new char[12][12];
    private static int[] initialPosition; //the maze's entrance
    private static int[] finalPosition; //the maze's exit on the right


    public static void main(String[] args) {
        String mazeString =
                "# # # # # # # # # # # #" +
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

        System.out.println("Recursive backtracking process to solve this maze:");
        mazeTraversal(initialPosition, null, false);

        System.out.println("\nDirect path to solve this maze:");
        delineatePath(initialPosition);

    }

    private static void processMazeString(String mazeString) //processes mazeString into mazeArray
    {
        initialPosition = new int[]{2, 0};
        finalPosition = new int[]{4, 11};
        for (int i = 0; i < 12; i++)
            mazeArray[i] = mazeString.replaceAll(" ", "")
                    .substring(12 * i, 12 * (i + 1))
                    .toCharArray();
    }

    private static void mazeTraversal(int[] thisPosition, int[] lastPosition, boolean backtrack) {
        boolean reachedEnd = Arrays.equals(thisPosition, finalPosition);
        int[] nextPosition = generateNewPosition(thisPosition, lastPosition);
        if (reachedEnd) {
            mazeArray[finalPosition[0]][finalPosition[1]] = '*';
            printMazeArray();
            mazeArray[finalPosition[0]][finalPosition[1]] = '.';
        } else {
            mazeArray[thisPosition[0]][thisPosition[1]] = '*';
            printMazeArray();
            if ((backtrack || Arrays.equals(nextPosition, lastPosition)) && !moreThanOnePossibleMovementsBoolean(thisPosition)) {
                /*blocks unfruitful paths, but never where more than one movement is possible*/
                mazeArray[thisPosition[0]][thisPosition[1]] = '#';
                mazeTraversal(nextPosition, thisPosition, true);
            } else {
                mazeArray[thisPosition[0]][thisPosition[1]] = '.';

                mazeTraversal(nextPosition, thisPosition, false);
            }
        }
    }

    private static int[] generateNewPosition(int[] position, int[] lastPosition) { //nextPosition == lastPosition, if and only if progressive movement is impossible
        int[] operators0 = operatorFunction(position[0]); //moves from row to row (down and up)
        int[] operators1 = operatorFunction(position[1]); //moves from column to column (right and left)
        for (int operator : operators0) {
            int[] newPos = {operator, position[1]};
            char character = mazeArray[newPos[0]][newPos[1]];
            if (character == '.' && !Arrays.equals(newPos, lastPosition)) {
                return newPos;
            }
        }
        for (int operator : operators1) {
            int[] newPos = {position[0], operator};
            char character = mazeArray[newPos[0]][newPos[1]];
            if (character == '.' && !Arrays.equals(newPos, lastPosition))
                return newPos;
        }
        return lastPosition;
    }

    private static void printMazeArray() {
        System.out.println();
        for (char[] chars : mazeArray)
            System.out.printf("%s%n", Arrays.toString(chars)
                    .replaceAll("[\\[,\\]]", ""));
    }

    private static int[] operatorFunction(int position) {
        return new int[]{position + 1 < 12 ? position + 1 : position,
                position - 1 >= 0 ? position - 1 : position}; /*two operators to generate movements,
                                                                avoids ArrayIndexOutOfBoundsException*/
    }

    private static boolean moreThanOnePossibleMovementsBoolean(int[] pos) { //similar to generateNewPosition, but only counts possible movements
        int[] operators0 = operatorFunction(pos[0]);
        int[] operators1 = operatorFunction(pos[1]);
        int sectionsCounter = 0;
        for (int operator : operators0) {
            char character = mazeArray[operator][pos[1]];
            if (character == '.')
                sectionsCounter++;
        }
        for (int operator : operators1) {
            char character = mazeArray[pos[0]][operator];
            if (character == '.')
                sectionsCounter++;
        }
        return (sectionsCounter > 1);
    }

    private static void delineatePath(int[] thisPosition) {/*Generates direct path to the exit, the algorithm has already
                                                           blocked off the non-direct solutions by the time this method is called*/
        if (Arrays.equals(thisPosition, finalPosition))
            System.out.printf("%n%s.", Arrays.toString(thisPosition));
        else {
            mazeArray[thisPosition[0]][thisPosition[1]] = '#';
            System.out.printf("%n%s to", Arrays.toString(thisPosition));
            delineatePath(generateNewPosition(thisPosition, null));
        }
    }
}
