//TODO: do
public class MazeRecursiveBacktracking {

    private static char[][] mazeArray = new char[12][12];

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
    }

    private static void processMazeString(String mazeString) //processes mazeString into mazeArray
    {
        for (int i = 1; i <= 12; i++)
            mazeArray[i - 1] = mazeString.substring(12 * (i - 1), 12 * i)
                    .replaceAll(" ", "").toCharArray();
    }


}
