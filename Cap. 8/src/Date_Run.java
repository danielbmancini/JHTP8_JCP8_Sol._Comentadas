import ex8_15.Date;
import ex8_15.month;

/*
    Exercise 8.15 main class
 */
public class Date_Run {
    public static void main(String[] args) {
        Date aDate = new Date(month.September, 11, 2019);

        System.out.println(aDate.toString_a());
        System.out.println(aDate.toString_b());
        System.out.println(aDate.toString_c());
    }
}