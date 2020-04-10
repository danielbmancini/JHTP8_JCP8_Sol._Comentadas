/*
    exercise 18.10
 */
public class RecursionVisualization {
    private static final long number = 6;

    public static void main(String[] args) {
        System.out.printf("%nRecursion process for calculating %d!:", number);
        System.out.printf("%n%nResult: %d", factorial(number, 0));
    }

    public static long factorial(long num, int level) {
        if (num <= 1) {
            System.out.printf("%nReturning 1 at %d levels of recursion.", level + 1);
            return 1;
        } else {
            level++;
            System.out.printf("%nReturned 'number*factorial(number - 1)' %d time(s).", level);
            return num * factorial(num - 1, level);
        }
    }
}
