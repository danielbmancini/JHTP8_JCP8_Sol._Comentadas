package ex16_06;

import java.util.Scanner;

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
