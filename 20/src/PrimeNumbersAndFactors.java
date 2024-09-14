import java.math.BigInteger;
import java.util.*;

/*
    exercise 20.19
    Implementação com BigInteger
 */
public class PrimeNumbersAndFactors {
    private static HashSet<BigInteger> factors = new HashSet<>();
    private static Random random = new Random();

    private static boolean isProbablyPrime(BigInteger num) { //Miller-Rabin test

        BigInteger four = BigInteger.valueOf(4);
        if (num.compareTo(four) < 0)
            return true;
        //find biggest and lowest integers k and m such that n - 1 = 2^k * m holds
        long k = 0;
        BigInteger m = num.subtract(BigInteger.ONE);
        while (m.mod(BigInteger.TWO).equals(BigInteger.ZERO)) { //m % 2 == 0
            m = m.divide(BigInteger.TWO); //m /= 2
            k++;
        }

        for (int i = 0; i < 100; i++) { //test 100 times for non-primality
            BigInteger a;
            do {
                a = new BigInteger(num.bitLength() - 3, random).add(BigInteger.TWO);
            } while (a.compareTo(num) >= 0);  // Ensure it's less than max
            //System.out.println(a);
            //int a = random.nextInt(number - 3) + 2; //a is between 1 and n-1, exclusive
            BigInteger b = a.modPow(
                    m, num); //computes b = a^m mod number

            if (b.equals(num.subtract(BigInteger.ONE)) || b.equals(BigInteger.ONE))
                continue;
            boolean continueOuterLoop = false;
            for (long j = 0; j < k; j++) {
                b = b.modPow(BigInteger.TWO, num);
                if (b.equals(num.subtract(BigInteger.ONE))) {
                    continueOuterLoop = true;
                    break;
                }
            }
            if (!continueOuterLoop) //if the inner loop was not broken
                return false; //number is composite
        }
        return true; //number is probably prime
    }

    public static BigInteger[] factor(BigInteger num) { //Variation of Fermat's factoring method

        BigInteger x = num.sqrt();

        BigInteger t = BigInteger.TWO.multiply(x).add(BigInteger.ONE);

        BigInteger r = x.multiply(x).subtract(num);


        BigInteger[] root = r.negate().sqrtAndRemainder();
        while (!root[1].equals(BigInteger.ZERO)) {
            r = r.add(t);
            t = t.add(BigInteger.TWO);
            root = r.sqrtAndRemainder();
        }
        x = t.subtract(BigInteger.ONE).divide(BigInteger.TWO);

        return new BigInteger[]{x.add(root[0]), x.subtract(root[0])};
    }

    public static void main(String[] args) {
        factors.add(BigInteger.ONE);
        System.out.println("Insert number.");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        BigInteger num = new BigInteger(number);

        //Will disregard negative numbers
        if (isProbablyPrime(num)) {
            factors.add(num);
            System.out.printf("%nNumber is probably prime.%n");
        } else {
            System.out.println("Composite number.");
            System.out.println("Show factors? '1' for yes");
            String q = scanner.next();

            if (Objects.equals(q, "1")) {
                while (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    num = num.divide(BigInteger.TWO);
                    factors.add(BigInteger.TWO);
                }
                processFactors(num);
                System.out.println("Factor set is:" + factors);
            }
        }


    }

    private static void processFactors(BigInteger num) { //add prime factors to factors' set
        for (BigInteger aFactor : factor(num))
            if (isProbablyPrime(aFactor))
                factors.add(aFactor);
            else
                processFactors(aFactor); //process non-prime factors
    }

}
