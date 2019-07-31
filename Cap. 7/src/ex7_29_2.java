//recursive version - uses args[0] as n --
public class ex7_29_2 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(args[0]) + "-th number in fibonacci sequence is: " + fibonacci(Integer.parseInt(args[0])));
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}