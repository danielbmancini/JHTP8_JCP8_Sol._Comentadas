import java.util.Scanner;

/*
 * exercise 16.11
 */
public class OccurrenceSearch_indexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");
        String input = scanner.nextLine();
        System.out.println("Input character.");
        String character = scanner.nextLine();
        int occurrences = 0;
        int range = 0;
        while (input.indexOf(character, range) != -1) //count occurrences by searching in increasingly restrictive ranges
        {
            occurrences++;
            range = input.indexOf(character, range) + 1;
        }
        System.out.printf("%nOccurrences of character '%s': %d", character, occurrences);

    }
}
