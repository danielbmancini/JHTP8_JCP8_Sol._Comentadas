import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a word.");
        String string = scanner.next();
        if (string.length() < 2)
            System.out.println("Invalid word.");
        else
            printLatinWord(string);
    }

    private static void printLatinWord(String word) {
        System.out.printf("%nWord: %s%n", word);
        System.out.print("Pig Latin: ");
        String[] chars = word.split("");
        for (int i = 1; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.print(chars[0] + "ay");
    }
}
