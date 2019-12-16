import java.util.Arrays;
import java.util.Scanner;

/*
    exercise 16.17
 */
public class ThreeLetterAnagram {
    private static int[][] combinations = { // ₅C₃ = 10 combinations
            {0, 0, 1, 1, 1},
            {1, 0, 0, 1, 1},
            {0, 1, 0, 1, 1},
            {1, 0, 1, 0, 1},
            {0, 1, 1, 0, 1},
            {1, 1, 0, 0, 1},
            {1, 1, 1, 0, 0},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 0, 1, 1, 0}};
    private static int permutationsNumber = 0; //is 60 at the end of the program (3! permutations * ₅C₃ combinations = 60)

    public static void main(String[] args) {
        boolean bool;
        char[] tokens;
        do {
            bool = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a 5 letter word with no repeating letters:");
            tokens = scanner.next().toCharArray();
            Arrays.sort(tokens);
            for (int i = 0; i < tokens.length - 1; i++) //checks for letter repetition using binary search
                if (Arrays.binarySearch(tokens, i + 1, tokens.length, tokens[i]) >= 0) {
                    System.out.println("Please input a word with no repeating letters.");
                    bool = false;
                }
            if (tokens.length != 5) { //check word length
                System.out.println("Please input a 5 letter word.");
                bool = false;
            }
        } while (!bool);
        for (int[] combination : combinations) { //construct a char array to permute from tokens array, using each of the 10 possible combinations of 3 tokens
            char[] charArray = new char[3];
            int k = 0;
            for (int i = 0; i < combination.length; i++)
                if (combination[i] == 1) {
                    charArray[k] = tokens[i];
                    k++;
                }

            permute(charArray, charArray.length); //prints permutation from a given combination
        }
        System.out.printf("%nNumber of permutations: %d", permutationsNumber);
    }

    private static void permute(char[] a, int n) {
        if (n == 1) { //print permutation from char array
            permutationsNumber++; //for each 'done' permutation, increase permutationsNumber
            System.out.println();
            for (char ak : a)
                System.out.print(ak);
            return;
        }
        for (int i = 0; i < n; i++) { //recursively permute
            swap(a, i, n - 1);
            permute(a, n - 1);
            swap(a, i, n - 1);
        }
    }

    private static void swap(char[] a, int i, int k) {
        char temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
