import ex8_12.Complex;

/*
    Exercise 8.12 main class
 */
public class Complex_Run {
    public static void main(String[] args) {
        Complex number1 = new Complex(2f, 3f);
        Complex number2 = new Complex(4f, 5f);
        Complex sum = number1.sumWith(number2);
        System.out.printf("%s + %s =%n%s.%n%n", number1.printThisNumber(), number2.printThisNumber(), sum.printThisNumber());
        Complex subtraction = sum.subtractWith(number2);
        System.out.printf("%s - %s =%n%s.", sum.printThisNumber(), number2.printThisNumber(), subtraction.printThisNumber());
    }
}