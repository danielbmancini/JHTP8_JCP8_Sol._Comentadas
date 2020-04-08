package ex17_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class GetResponses {
    private static Formatter formatter;
    private static int[] responses;

    public static void generateResponses() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Input responses separated by an empty space.");
        String[] tokens = scanner.next().split(" ");
        responses = new int[tokens.length];
        for (int i = 0; i < responses.length; i++)
            responses[i] = Integer.parseInt(tokens[i]);

        try {
            formatter = new Formatter(new File("numbers.txt"));
            for (int num : responses)
                formatter.format("%d%n", num);
        } catch (FileNotFoundException e) {
            System.err.println("Couldn't create output file.");
        } finally {
            formatter.close();
        }
    }
}
