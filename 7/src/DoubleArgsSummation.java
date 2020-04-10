/*
    exercise 7.16
 */
public class DoubleArgsSummation {
    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        System.out.println(sum);
    }
}