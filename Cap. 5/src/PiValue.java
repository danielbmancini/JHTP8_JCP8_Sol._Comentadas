/**
 * exercise 5.20
 */

public class PiValue {
    public static void main(String[] args) {
        double picalculado = 4;

        for (int i = 2; i <= 200000; i++) {
            double a = (4.0 / ((i * 2) - 1));

            if (i % 2 == 0)
                picalculado = picalculado - a;
            else
                picalculado = picalculado + a;
        }//fim de for

        System.out.printf("%f", picalculado);
    }
}

