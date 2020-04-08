/*
    exercise 18.14
 */

import java.util.Scanner;

public class RecursivePalindromeTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("(Insert candidate)\n");

        char[] string = scanner.next().replaceAll("[ .,?'!\":;]", "") //removes punctuation, white spaces and turns everything lower case
                .toLowerCase().toCharArray();

        System.out.println(testPalindrome(0, string.length - 1, string));
    }

    private static boolean testPalindrome(int lo, int hi, char[] candidate) {
        boolean evenCase = (hi - lo == 1) && (candidate[lo] == candidate[hi]); //base case for candidates with an even length
        if (lo == hi || evenCase)
            return true;
        else if (candidate[lo] == candidate[hi])
            return testPalindrome(lo + 1, hi - 1, candidate);

        return false;
    }
}
