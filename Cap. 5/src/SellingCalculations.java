import java.util.Scanner;
/*
 * exercise 5.17
 */
public class SellingCalculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //se a é o conjunto dos preços, e b é o conjunto das quantidades vendidas com o mesmo tamanho de a,

        double[] a = {2.98, 4.5, 9.98, 4.49, 6.87};
        int[] b = new int[a.length];
        double[] c = new double[b.length];
        for (int i = 0; i < b.length; i++) { //preenche b arbitrariamente
            System.out.printf("%n qnt. produto %d vendido é:",i+1);
            int y = scanner.nextInt();
             b[i] = y;
        }

        for(int f = 0; f < c.length; f++)
            c[f] = a[f]*b[f];

        for(int g = 0; g < a.length; g++) {
            System.out.printf("%nQuantidade comprada do produto %d: %d",g+1,b[g]);
            System.out.printf("%nO preço de varejo do produto %d é %f%n", g + 1, c[g]);
        }

    }
}
