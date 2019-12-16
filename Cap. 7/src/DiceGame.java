import java.util.Random;

/*
    exercise 7.17
 */
public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int[] result = new int[11];

        for (int i = 0; i < 36000; i++) {
            int a = random.nextInt(6) + 1; //gera, inclusivamente, números de 1 a 6
            int b = random.nextInt(6) + 1;
            result[a + b - 2]++;
        }

        for (int i = 0; i < result.length; i++)
            System.out.printf("%nFreq. '%d': %d", 2 + i, result[i]);
    }
}