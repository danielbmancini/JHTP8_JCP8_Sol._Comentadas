import java.util.ArrayList;
import java.util.Scanner;
//uses ArrayLists instead of variable argument list, just for manipulation testing
//exercise 7.14
public class IntegerListing {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        System.out.println("Inserir número de inteiros:");
        int numint = scan.nextInt();
        System.out.println(product(lista, numint));
    }

    private static long product(ArrayList list, int numint) {
        long productfinal = 1;

        for (int i = 0; i < numint; i++) {
            System.out.printf("%nInteiro %d/%d: ", i + 1, numint);
            list.add(i, scan.nextInt());
        }

        for (int a = 0; a < numint; a++) {
            int b = (int) list.get(a);
            productfinal *= b;
        }
        return productfinal;
    }
}