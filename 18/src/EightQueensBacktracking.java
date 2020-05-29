/*
    exercise 18.15
 */

import java.util.Arrays;

public class EightQueensBacktracking {
    private static final int N = 8; //N queens for NxN boards
    private static final int[][] board = new int[N][N];
    private static int solutionCounter = 0;

    static {
        for (int[] array : board)
            Arrays.fill(array, 0);
    }

    private static void printSolution() {
        for (int[] row : board)
            System.out.printf("%s%n", Arrays.toString(row));
    }

    public static void main(String[] args) {
        solve(0);
        System.out.printf("%n%nN. of solutions: %d", solutionCounter);
    }

    private static boolean solve(int col) {
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                if (col < N - 1 && solve(col + 1))
                    board[i][col] = 0;
                if (col == N - 1) { //prints a solution and forces backtracking to get another
                    System.out.println();
                    printSolution();
                    solutionCounter++;
                    board[i][col] = 0;
                    return true;
                }
            }
        }
        return couldNotFitQueenInThisColumn(col); //returns true if backtracking is needed or false if not
    }

    private static boolean isSafe(int row, int col)
    // This method is contributed by Abhishek Shankhadhar
    {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    private static boolean couldNotFitQueenInThisColumn(int col) {
        for (int[] row : board)
            if (row[col] != 0)
                return false;
        return true;
    }

}
