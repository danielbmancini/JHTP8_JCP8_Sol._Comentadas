//TODO: finish too
import ex7_24.EightQueens;

import java.util.Scanner;
import java.util.Random;
public class EightQueens_run {
    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] aaa = {rand.nextInt(8), rand.nextInt(8)};
        System.out.println("\nEnter anything + enter to insert a queen, or enter to exit.");
        String command = scan.nextLine();
        if (!command.equals("")) {
            EightQueens.insert(EightQueens.verifyTable(aaa)[0], EightQueens.verifyTable(aaa)[1]);
            EightQueens.countQueens();
        }
        else
            System.exit(0);
        EightQueens.show();
    }
}
