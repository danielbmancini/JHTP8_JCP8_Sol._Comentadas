package ex8_12;

public class ex8_12_Complex_Run {
    public static void main(String[] args) {
        ex8_12_Complex number1 = new ex8_12_Complex(2f, 3f);
        ex8_12_Complex number2 = new ex8_12_Complex(4f, 5f);
        ex8_12_Complex sum = number1.sumWith(number2);
        System.out.printf("%s + %s =%n%s.%n%n", number1.printThisNumber(), number2.printThisNumber(), sum.printThisNumber());
        ex8_12_Complex subtraction = sum.subtractWith(number2);
        System.out.printf("%s - %s =%n%s.", sum.printThisNumber(), number2.printThisNumber(), subtraction.printThisNumber());
    }
}