import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
    exercise 20.20
 */
public class SortingTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert tokens:");
        String[] tokensArray = scanner.nextLine().split(" ");
        SortedSet<String> tokens = new TreeSet<>(Arrays.asList(tokensArray));

        System.out.printf("%nTokens: %s", tokens);
    }
}
