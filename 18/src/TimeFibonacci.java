import java.math.BigInteger;

/*
    exercise 18.23
 */
public class TimeFibonacci {
    private static final BigInteger aNumber = BigInteger.valueOf(25);
    private static int counter = 0;

    public static BigInteger fibonacci(BigInteger number) {
        counter++;
        if (number.equals(BigInteger.ZERO) ||
                number.equals(BigInteger.ONE))
            return number;
        else
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(BigInteger.TWO)));
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        String number = fibonacci(aNumber).toString();
        long time2 = System.currentTimeMillis();
        System.out.printf("%s%nfibonacci() calls: %d%nTime to calculate fibonacci(%s): %d ms%n", number,
                counter, aNumber, time2 - time1);

    }
}
