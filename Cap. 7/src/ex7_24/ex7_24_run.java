package ex7_24;
//TODO: finish too
import java.util.Scanner;
import java.util.Random;
public class ex7_24_run {
    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();
    public static void main(String[] args) {
        int[] aaa = {rand.nextInt(8),rand.nextInt(8)};
        System.out.println("\nEnter anything + enter to insert a queen, or enter to exit.");
        String command = scan.nextLine();
        if(!command.equals("")){
             ex7_24.insert(ex7_24.verifyTable(aaa)[0],ex7_24.verifyTable(aaa)[1]);
                ex7_24.countQueens();
            }
        else
            System.exit(0);
        ex7_24.show();
        main(args);
    }
}
