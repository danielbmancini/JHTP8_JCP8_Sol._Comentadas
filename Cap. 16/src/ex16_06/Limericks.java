/*
 * So, i guess a more efficient way to this kind of operation is by using ML to vectorize different limericks, in terms
 * of their word class structure, as prescribed by the book. Then, store the date outside the class and use java.io libraries.
 * That misses the scope of the chapter this exercise is situated, so i'm not doing it - everything will be manual.
 */
package ex16_06;

import java.util.Random;

public class Limericks {
    private Random random = new Random();
    private String[] prepositions = {"to", "from", "over", "under", "on"};

    private String[] articles = {"the", "a", "one", "some", "any"};

    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped", "did", "cooked", "lifted", "laughed",
            "died", "talked", "used", "dismissed", "smoked", "was", "felt", "punched", "bullied"};

    private String[] had = {"had"};
    private String[] was = {"was"};
    private String[] not = {"not"};
    private String[] of = {"of"};
    private String[] adverbs = {"solemnly", "sometimes", "speedily", "broadly", "busily", "calmly", "carefully", "carelessly", "cautiously", "certainly"
            , "madly", "majestically", "meaningfully", "mechanically", "merrily", "miserably"};

    private String[] pronouns = {"myself", "yourself", "himself", "herself", "i", "he", "she", "it", "this", "that"};

    private String[] conjunctions = {"after", "although", "as", "as if", "as long as", "as much as", "as soon as",
            "as though", "once", "when", "whenever", "where", "wherever", "while"};

    private String[][] nouns = {{"boy", "soy", "ploy", "toy", "homeboy", "joy"}, {"girl", "pearl", "whirl", "schoolgirl", "curl", "squirrel"},
            {"dog", "clog", "fog", "frog", "hog", "log", "hedgehog"},
            {"hash-brown", "clown", "frown", "gown", "noun", "town", "chinatown", "upside-down", "pronoun", "showdown"}};

    private String[] adjectives = {"bad", "good", "moist", "easy", "famous", "gifted", "eager", "faithful",
            "gentle", "happy", "jolly", "grumpy", "helpless", "itchy",
            "jealous", "flat", "high", "hollow", "low", "miniature", "petite",
            "puny", "scrawny", "disgusting", "fresh", "greasy", "juicy",
            "hot", "moldy", "nutritious", "nutty", "putrid", "rancid"};

    //3 different limerick structures vectors referencing Object[] grouping indexes.
    //each sub array corresponds to one verse.
    //a structuralist approach, you could say.
    private int[][] limerickStructure_1 = {{1, 10, 2, 0, 1, 11, 10},
            {9, 3, 1, 11, 10},
            {8, 2, 11, 0, 10},
            {11, 1, 10, 0, 8, 10},
            {8, 7, 10, 0, 1, 10}};

    private int[][] limerickStructure_2 = {{8, 7, 2, 1, 10, 0, 10},
            {9, 3, 11, 6, 2, 0, 10},
            {8, 2, 1, 10},
            {7, 2, 7, 10},
            {7, 1, 10, 2, 8, 9, 1, 10}};

    private int[][] limerickStructure_3 = {{8, 4, 1, 11, 10, 2, 10},
            {7, 11, 8, 2, 10},
            {8, 3, 2, 0, 1, 10},
            {5, 11, 0, 1, 10},
            {9, 7, 2, 7, 0, 10}};

    public String generateLimerick() {
        StringBuilder limerick = new StringBuilder();
        limerick.append("\n");
        int limerickStructure = random.nextInt(3) + 1;
        int counter;
        int k1 = random.nextInt(4); //which array of rhyming nouns to use 1
        int k2 = random.nextInt(4); //which array of rhyming nouns to use 2
        System.out.printf("%n%nUsing structure %d.", limerickStructure);
        switch (limerickStructure) {
            case 1:
                for (int i = 0; i < 5; i++) { //loops through the 5 arrays in limerickStructure_1
                    counter = 0;
                    limerick.append("\n");
                    for (int k : limerickStructure_1[i]) {
                        if (counter != limerickStructure_1[i].length - 1) {
                            String[] foo = getReference(k);
                            if (counter == 0) {
                                int index = random.nextInt(foo.length);
                                limerick.append(Character.toUpperCase(foo[index].charAt(0))).append(foo[index].substring(1)).append(" ");
                            } else
                                limerick.append(foo[random.nextInt(foo.length)]).append(" ");
                        } else if (i == 0 || i == 1 || i == 4) //these two here and in the other cases refer to the rhyming schemes of limericks (AABBA)
                            limerick.append(nouns[k1][random.nextInt(nouns[k1].length)]);
                        else
                            limerick.append(nouns[k2][random.nextInt(nouns[k2].length)]);
                        counter++;
                    }
                }

                return limerick.toString();
            case 2:
                for (int i = 0; i < 5; i++) { //loops through the 5 arrays in limerickStructure_2
                    counter = 0;
                    limerick.append("\n");
                    for (int k : limerickStructure_2[i]) {
                        if (counter != limerickStructure_2[i].length - 1) {
                            String[] foo = getReference(k);
                            if (counter == 0) {
                                int index = random.nextInt(foo.length);
                                limerick.append(Character.toUpperCase(foo[index].charAt(0))).append(foo[index].substring(1)).append(" ");
                            } else
                                limerick.append(foo[random.nextInt(foo.length)]).append(" ");
                        } else if (i == 0 || i == 1 || i == 4)
                            limerick.append(nouns[k1][random.nextInt(nouns[k1].length)]);
                        else
                            limerick.append(nouns[k2][random.nextInt(nouns[k2].length)]);
                        counter++;
                    }
                }
                return limerick.toString();
        }
        for (int i = 0; i < 5; i++) { //loops through the 5 arrays in limerickStructure_3
            limerick.append("\n");
            counter = 0;
            for (int k : limerickStructure_3[i]) {
                if (counter != limerickStructure_3[i].length - 1) {
                    String[] foo = getReference(k);
                    if (counter == 0) {
                        int index = random.nextInt(foo.length);
                        limerick.append(Character.toUpperCase(foo[index].charAt(0))).append(foo[index].substring(1)).append(" ");
                    } else
                        limerick.append(foo[random.nextInt(foo.length)]).append(" ");
                } else if (i == 0 || i == 1 || i == 4)
                    limerick.append(nouns[k1][random.nextInt(nouns[k1].length)]);
                else
                    limerick.append(nouns[k2][random.nextInt(nouns[k2].length)]);
                counter++;
            }
        }

        return limerick.toString();
    }

    private String[] getReference(int index) {
        switch (index) {
            case 0:
                return prepositions;
            case 1:
                return articles;
            case 2:
                return verbs;
            case 3:
                return had;
            case 4:
                return was;
            case 5:
                return not;
            case 6:
                return of;
            case 7:
                return adverbs;
            case 8:
                return pronouns;
            case 9:
                return conjunctions;
            case 10:
                return nouns[random.nextInt(nouns.length)];
        }
        return adjectives;
    }
}
