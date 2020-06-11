import java.util.Scanner;

/*
 * exercise 16.10
 */
public class LowercaseUppercaseTokenPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        for (int j = 0; j < tokens.length; j++)
            System.out.println(tokens[j].toUpperCase());
        System.out.println();
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i].toLowerCase());

    }
}
