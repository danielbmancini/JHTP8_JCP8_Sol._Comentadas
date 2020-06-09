import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/*
    exercise 20.13
 */

public class DuplicateRemoval {
    private static HashSet<String> set;

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name4");
        names.add("Name1");
        set = new HashSet<>(names);

        System.out.println("Set of names:");
        set.forEach(System.out::println); //prints each String in set

        System.out.println("%nSearch set for: ");
        String name = new Scanner(System.in).next();

        System.out.printf("\nSet contains \"%s\" ? %b", name, searchFirstName(name));
    }

    private static boolean searchFirstName(String firstName) {
        return set.contains(firstName);
    }
}
