import java.util.Scanner;

/*
 * exercise 16.9
 */
public class InverseTokenPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");
        scanner.useDelimiter("\\n"); //so scanner reads the whole input
        String input = scanner.next();
        String[] tokens = input.split(" ");
        for (int i = tokens.length - 1; i >= 0; i--)
            System.out.println(tokens[i]);


    }
}
