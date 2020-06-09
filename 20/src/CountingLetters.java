import java.util.*;

/*
    exercise 20.14
 */
public class CountingLetters {

    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        for (char token : characters) {
            if (!Character.isLetter(token)) //do not count character that are not letters
                continue;
            if (map.containsKey(token)) {
                int count = map.get(token);
                map.put(token, count + 1);
            } else
                map.put(token, 1);
        }
    }

    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (char key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));
    }
}
