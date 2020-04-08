package ex17_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class OutputResponses {
    private static ArrayList<Integer> responses;
    private static Scanner scanner;

    public static void output() {
        try {
            responses = new ArrayList<>();
            System.out.println("Generating output...");
            scanner = new Scanner(new File("numbers.txt"));
            scanner.useDelimiter("\\n");
            while (scanner.hasNext("\\d")) {
                responses.add(scanner.nextInt());
            }
            Formatter formatter = new Formatter(new File("output.txt"));

            int[] frequency = new int[responses.size()];
            Arrays.fill(frequency, 0);
            for (Integer integer : responses)
                frequency[responses.indexOf(integer)]++;

            formatter.format("%s%10s%n", "Rating", "Frequency");

            for (int i = 0; i < frequency.length; i++)
                formatter.format("%d%10d%n", responses.get(i),
                        frequency[responses.indexOf(responses.get(i))]); //makes sure that all occurrences of responses(i) have the same frequency
            System.out.println("Done!");
            formatter.flush();
        } catch (FileNotFoundException exception) {
            System.err.println("Couldn't open or create files.");
        } finally {
            scanner.close();
        }
    }
}
