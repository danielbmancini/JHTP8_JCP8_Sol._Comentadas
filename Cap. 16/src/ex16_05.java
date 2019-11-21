import java.util.Random;

public class ex16_05 {
    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            char[] chars = articles[random.nextInt(5)].toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            System.out.printf("%n%s %s %s %s %s %s.%n", String.valueOf(chars),
                    nouns[random.nextInt(5)], verbs[random.nextInt(5)],
                    prepositions[random.nextInt(5)], articles[random.nextInt(5)], nouns[random.nextInt(5)]);
        }
    }
}
