import java.util.Arrays;
import java.util.Scanner;

/*
    exercise 16.18b
 */
public class WordCountingByLength {
    static int[] lengths; //tabular list need to be a crescent sequence

    private static int getBiggestLength(String[] words) {
        int biggestLength = 0;
        for (String word : words)
            if (word.length() > biggestLength)
                biggestLength = word.length();
        return biggestLength + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Input sentence.");
        String[] words = scanner.next().split(" ");

        lengths = new int[getBiggestLength(words)];
        Arrays.fill(lengths, 0);
        for (String word : words)
            lengths[word.length()]++;

        System.out.println("Word Length\t\tOccurrences");
        for (int i = 1; i < lengths.length; i++)
            System.out.printf("%n%d\t\t\t\t\t%d", i, lengths[i]);

    }
}
