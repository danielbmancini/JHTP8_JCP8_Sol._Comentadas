import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
    exercise 20.16
 */
public class CountingDuplicateWords {
    public static void main(String[] args) {
        System.out.println("Insert sentence.");
        String[] sentence = new Scanner(System.in)
                .nextLine()
                .split(" ");

        processDuplicates(sentence);
    }

    private static void processDuplicates(String[] sentence) {
        HashMap<String, Integer> duplicateHashMap = new HashMap<>();
        for (String token : sentence) //create word <-> appearances mappings
            if (!duplicateHashMap.containsKey(token))
                duplicateHashMap.put(token, 1);
            else
                duplicateHashMap.replace(token,
                        duplicateHashMap.get(token) + 1);

        int count = 0;
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> mapping : duplicateHashMap.entrySet())
            //print repeated words mappings
            if (mapping.getValue() > 1) {
                System.out.printf("\"%s\" is repeated %d times%n", mapping.getKey(), mapping.getValue());
                count++;
            }

        System.out.println("Duplicate word count: " + count);

    }
}
