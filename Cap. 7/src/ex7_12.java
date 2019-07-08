import java.util.Arrays;
import java.util.Scanner;

public class ex7_12 { /* Resolve uma versão adaptada do exercício 12 do capítulo 7, onde se desconsidera a necessidade de entradas no intervalo de 10 a 100.*/
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { //problema convoluto..
        int[] fivenum = new int[5];

        printAndFill(fivenum);
        printNonDuplicatesEntradas(fivenum);
    }

    private static void printAndFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%n Enter number %d/5:", i + 1);
            array[i] = scan.nextInt();
        }
    }

    private static boolean[] isnotUnique(int[] array, int index) {
        boolean[] duplicates = new boolean[array.length];
        Arrays.fill(duplicates, false); // desnecessário; apenas usado para fins de generalização
        for (int j = 0; j < array.length; j++)
            if (j != index && array[j] == array[index]) {
                duplicates[index] = true;
                array[index] = 0;
            }
        return duplicates;
    }

    private static void printNonDuplicatesEntradas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!isnotUnique(array, i)[i]) {
                System.out.println(array[i]);
            }
        }
    }
}



