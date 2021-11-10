import java.util.Arrays;
import java.util.Scanner;
/*
    exercise 17.12
 */
public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence.");

        Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
