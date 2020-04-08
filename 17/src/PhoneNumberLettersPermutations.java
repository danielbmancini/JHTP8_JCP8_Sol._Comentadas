import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*
    exercise 17.11
 */
public class PhoneNumberLettersPermutations {
    private static char[][] arrays;
    private static int permCount = 0;
    public static PrintStream printStream;

    static {
        try {
            printStream = new PrintStream(new File("perms.txt"));
            printStream.print("Permutations:");
        } catch (FileNotFoundException e) {
            System.err.println("Couldn't create output file.");
        }
    }

    public static char[] letters(int n) throws IllegalArgumentException {
        switch (n) {
            case 2:
                return new char[]{'A', 'B', 'C'};
            case 3:
                return new char[]{'D', 'E', 'F'};
            case 4:
                return new char[]{'G', 'H', 'I'};
            case 5:
                return new char[]{'J', 'K', 'L'};
            case 6:
                return new char[]{'M', 'N', 'O'};
            case 7:
                return new char[]{'P', 'R', 'S'};
            case 8:
                return new char[]{'T', 'U', 'V'};
            case 9:
                return new char[]{'W', 'X', 'Y'};
        }
        throw new IllegalArgumentException("Illegal phone number.");
    }

    public static void cartesianProduct(String s, int a) //necessary complexity for the cartesian product of n sets: O(sets.length^n)
    {
        if (a < 7) {
            for (int i = 0; i < 3; i++) {
                String t = s + arrays[a][i];
                cartesianProduct(t, a + 1);
            }
        } else {
            permCount++;
            printStream.format("%n%s", s);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Insert phone number.");
        String phoneNumber = scanner.next();
        arrays = new char[phoneNumber.length() - 1][3];
        int count = 0;
        for (char num : phoneNumber.toCharArray())
            if (num != '-') {
                arrays[count] = letters(Character.getNumericValue(num));
                count++;
            }
        cartesianProduct("", 0);
        System.out.println("\n\nPermutation count: " + permCount);
        printStream.close();
    }
}
