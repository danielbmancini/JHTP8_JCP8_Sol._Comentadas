import java.util.Arrays;
import java.util.Scanner;

/*
 * exercise 16.8
 */
public class PhoneNumberTokenization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n"); //so scanner reads the whole input
        System.out.println("Input phone number.");
        String phone = scanner.next();
        String[] tokens = phone.split("( )|-|\\(|\\)");
        StringBuilder phoneNumber = new StringBuilder();
        for (String string : tokens)//concatenates non empty numeric strings
            if (!string.equals(""))
                phoneNumber.append(string);
        System.out.printf("%nTokens array: %s", Arrays.toString(tokens));
        System.out.printf("%nJoined phone number: %s", phoneNumber.toString());
    }
}
