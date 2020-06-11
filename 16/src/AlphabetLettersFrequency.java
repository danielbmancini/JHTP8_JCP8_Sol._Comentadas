import java.util.Scanner;

/*
   exercise 16.12
 */
public class AlphabetLettersFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");
        String input = scanner.nextLine().toLowerCase();//to count all letters disregarding case
        int[] occurrences = new int[26];

        System.out.println("Letter\tOccurrences");

        for (int i = 0; i < occurrences.length; i++) {
            int range = 0;
            int ch = 97 + i; //iterates by unicode decimal lowercase alphabet code
            while (input.indexOf(ch, range) != -1) //count occurrences by searching in increasingly restrictive ranges
            {
                occurrences[i]++;
                range = input.indexOf(ch, range) + 1;
            }
            System.out.printf("%c\t\t\t%d%n", ch, occurrences[i]);
        }
    }
}
