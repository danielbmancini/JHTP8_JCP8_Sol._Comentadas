import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;

/*
    exercise 18.21/22
 */
public class RecursiveMazeGenerator {
    private static int length;
    private static char[][] mazeArray;
    private static final Random random = new Random();
    private static int[] finalPosition; //ends up being at (length - 2 + (length % 2), length - 2 + (length % 2))

    public static void main(String[] arg) {
        length = 12;
        startMazeArray();
        generateMaze(new int[]{0, 0});
        printMazeArray();
    }

    private static void startMazeArray() {
        mazeArray = new char[length][length];
        finalPosition = new int[]{length - 2 + (length % 2), length - 2 + (length % 2)};
        for (char[] chars : mazeArray)
            Arrays.fill(chars, '#');
    }

    private static void generateMaze(int[] position) {
        mazeArray[position[0]][position[1]] = '.';
        boolean atLeastOnePossibleMovement = true;
        while (atLeastOnePossibleMovement) {
            ArrayList<Function<int[], int[]>> movementList = possibleMovements(position);
            int index;
            try {
                index = random.nextInt(movementList.size());
            } catch (IllegalArgumentException exception) {
                return;
            }
            Function<int[], int[]> direction = movementList.get(index);
            int[] nextCell = direction.apply(position);
            mazeArray[nextCell[0]][nextCell[1]] = '.';

            movementList.remove(index);

            generateMaze(direction.apply(nextCell));
            atLeastOnePossibleMovement = movementList.size() > 0;
            if (Arrays.equals(position, finalPosition))
                return;
        }
    }
    //returns a list with valid directions for movement
    private static ArrayList<Function<int[], int[]>> possibleMovements(int[] cell) {
        ArrayList<Function<int[], int[]>> possibleDirectionsList = new ArrayList<>();
        possibleDirectionsList.add(position -> new int[]{position[0], position[1] + 1});
        possibleDirectionsList.add(position -> new int[]{position[0], position[1] - 1});
        possibleDirectionsList.add(position -> new int[]{position[0] + 1, position[1]});
        possibleDirectionsList.add(position -> new int[]{position[0] - 1, position[1]});

        ArrayList<Function<int[], int[]>> possibleDirectionsListCopy = new ArrayList<>(possibleDirectionsList);
        for (Function<int[], int[]> function : possibleDirectionsList) {
            try {
                int[] newCell = function.apply(function.apply(cell));
                if (mazeArray[newCell[0]][newCell[1]] != '#')
                    possibleDirectionsListCopy.remove(function);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                possibleDirectionsListCopy.remove(function);
            }
        }

        return possibleDirectionsListCopy;
    }

    private static void printMazeArray() {
        System.out.println();
        for (char[] array : mazeArray)
            System.out.println(Arrays.toString(array)
                    .replaceAll("[\\[\\],]", ""));
    }
}
