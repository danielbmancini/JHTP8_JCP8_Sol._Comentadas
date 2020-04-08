/*
    exercise 18.11
 */
public class GCD {
    public static void main(String[] args) {
        int x = 53;
        int y = 53;

        System.out.println(recursiveGCD(x, y));
    }

    private static int recursiveGCD(int a, int b) {
        if ((a != 0) && b == 0)
            return a;
        else
            return recursiveGCD(b, a % b);
    }
}
