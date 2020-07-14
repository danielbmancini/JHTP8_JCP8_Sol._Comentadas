import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumbersAndFactors {
    private static HashSet<Integer> factors = new HashSet<>();
    private static Random random = new Random();

    private static boolean isProbablyPrime(int number) { //Miller-Rabin test
        if (number < 4)
            return true;
        //find biggest and lowest integers k and m such that n - 1 = 2^k * m holds
        int k = 0;
        int m = number - 1;
        while (m % 2 == 0) {
            m /= 2;
            k++;
        }

        for (int i = 0; i < 100; i++) { //test 100 times for non-primality
            int a = random.nextInt(number - 3) + 2; //a is between 1 and n-1, exclusive
            BigInteger b = BigInteger.valueOf(a).modPow(
                    BigInteger.valueOf(m), BigInteger.valueOf(number)); //computes b = a^m mod number

            if (b.equals(BigInteger.valueOf(number - 1)) || b.equals(BigInteger.ONE))
                continue;
            boolean continueOuterLoop = false;
            for (int j = 0; j < k; j++) {
                b = b.modPow(BigInteger.TWO, BigInteger.valueOf(number));
                if (b.equals(BigInteger.valueOf(number - 1))) {
                    continueOuterLoop = true;
                    break;
                }
            }
            if (!continueOuterLoop) //if the inner was not broken
                return false; //number is composite
        }
        return true; //number is probably prime
    }

    private static int[] factor(int number) { //Variation of Fermat's factoring method
        double x = Math.floor(Math.sqrt(number));
        double t = 2 * x + 1;
        double r = x * x - number;

        double root = Math.sqrt(r);
        while (root != Math.floor(root)) {
            r += t;
            t += 2;
            root = Math.sqrt(r);
        }
        x = (t - 1) / 2;

        return new int[]{(int) (x + root), (int) (x - root)};
    }

    public static void main(String[] args) {
        System.out.println("Insert number.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //to correctly factor negative numbers
        int sign = (int) Math.signum(number);
        factors.add(sign);
        number *= sign;

        //return 1 and number if it's is prime, or factor number if it's composite
        if (isProbablyPrime(number)) {
            factors.add(number);
            System.out.printf("%n%d is probably prime.%n", number);
        } else {
            while (number % 2 == 0) {
                factors.add(2);
                number /= 2;
            }
            processFactors(number);
        }
        System.out.println("Factor set is: " + factors);
    }

    private static void processFactors(int number) { //add prime factors to factors' set
        for (int aFactor : factor(number))
            if (isProbablyPrime(aFactor))
                factors.add(aFactor);
            else
                processFactors(aFactor); //process non-prime factors
    }

}
