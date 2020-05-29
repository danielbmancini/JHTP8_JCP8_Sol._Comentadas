import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;

/*
    exercise 7.24
    uses a different heuristic of that proposed by the book - here, each row is filled with the number of encounter with queens.
 */
public class EightQueensHeuristic {
    private static final int N = 8; /* the program isn't guaranteed to end, although with an increasing N, the solution space increases asymptotically
                                    and hence there are increasingly more 'good' random seeds. */
    private static final int[][] board = new int[N][N];
    private static final Random random = new Random();
    private static ArrayList<int[]> queens;
    private static final ArrayList<Function<int[], int[]>> diagonals = new ArrayList<>(); /* ArrayList containing functions to map a position to a diagonal
                                     - simplifies the process of checking all 4 diagonals. */

    //initialize arrays and ArrayLists in the start of the program
    static {
        shuffle();

        diagonals.add(aPosition -> new int[]{aPosition[0] + 1, aPosition[1] + 1}); //southeast
        diagonals.add(aPosition -> new int[]{aPosition[0] + 1, aPosition[1] - 1}); //southwest
        diagonals.add(aPosition -> new int[]{aPosition[0] - 1, aPosition[1] - 1}); //northwest
        diagonals.add(aPosition -> new int[]{aPosition[0] - 1, aPosition[1] + 1}); //northeast
    }

    private static void shuffle() {
        for (int[] row : board)
            Arrays.fill(row, 0);
        queens = new ArrayList<>();
        for (int i = 0; i < N; i++)
            queens.add(new int[]{random.nextInt(N), i}); //every queen is put in a different row
    }

    private static void assignConflicts(int row, int column) {
        int count = queens.get(column)[0] == row ? -2 : -1; //corrects the variable to not include the queen in this column
        for (int i = 0; i < N; i++) {
            if (queens.get(column)[0] == i)
                count++;
            if (queens.get(i)[0] == row)
                count++;
        }

        for (Function<int[], int[]> diagonal : diagonals) {
            int[] position = diagonal.apply(new int[]{row, column}); //the position parameter of this method mapped to a diagonal
            while (isOnBoard(position)) {
                if (queens.get(position[1])[0] == position[0])
                    count++;
                position = diagonal.apply(position); //further maps to a diagonal
            }
        }
        board[row][column] = count;
    }

    public static void main(String[] args) {
        while (true) { // 'repairing' loop.
            int swaps = 0;
            boolean reached = false;
            for (int column = 0; column < N; column++) {
                int row = searchMinimumRow(column);
                if (queens.get(column)[0] != row) { //if 'row' is in fact a new row
                    swaps++;
                    queens.get(column)[0] = row; //queen' new position in this column is 'row'
                }
                if (solutionReached()) {
                    reached = true;
                    break;
                }
            }
            if (reached)
                break;
            if (swaps == 0) //shuffles if stuck in a local minimum
                shuffle();

        }
        for (int[] position : queens)
            board[position[0]][position[1]] = -1;
        printSolutionFiltered();
    }

    private static boolean isOnBoard(int[] aPosition) {
        return aPosition[0] < N && aPosition[0] >= 0 && aPosition[1] >= 0 && aPosition[1] < N;
    }

    private static int searchMinimumRow(int column) { //returns the row with the least number of conflicts in this column
        for (int row = 0; row < N; row++)
            assignConflicts(row, column);
        int minRow = 0;
        for (int i = 0; i < N; i++)
            if (board[i][column] < board[minRow][column])
                minRow = i;
        return minRow;
    }

    private static void printSolutionFiltered() {
        System.out.println();
        for (int[] row : board)
            System.out.println(Arrays.toString(row)
                    .replaceAll("1", "0")
                    .replaceAll("-0", "1")
                    .replaceAll("[^1, \\[\\]]", "0"));
    }


    private static boolean solutionReached() {
        boolean solutionReached = true;

        for (int[] position : queens) {
            assignConflicts(position[0], position[1]);
            solutionReached = board[position[0]][position[1]] == 0 && solutionReached;
        }
        return solutionReached;
    }
}
