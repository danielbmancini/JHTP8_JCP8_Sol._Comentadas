import ex16_06.Limericks;

import java.util.Scanner;

/*
    Exercise 16.6 main class
 */
public class LimericksTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Limericks limericks = new Limericks();
        System.out.println("Input n. of limericks to generate:");
        int limericksNumber = scanner.nextInt();

        for (int i = 0; i < limericksNumber; i++) {
            System.out.print(limericks.generateLimerick());
        }
    }
}
