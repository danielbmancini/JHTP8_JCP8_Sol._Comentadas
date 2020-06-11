import java.util.Scanner;

/*
    exercise 16.4
 */
public class ED_TerminatedTokenPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");
        String[] tokens = scanner.nextLine().split(" ");
        for (String token : tokens)
            if (token.indexOf("ED") == token.length() - 2) //'ED' is in the end of token
                System.out.println(token);

    }
}
