import java.util.Arrays;
import java.util.Scanner;
//generalized solution (excludes the necessity to enter in the 10-100 interval) for the 12º problem in the 7º chapter.
public class ex7_12 { /* Resolve uma versão adaptada do exercício 12 do capítulo 7, onde se desconsidera a necessidade de entradas no intervalo de 10 a 100.*/
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { //problema convoluto..
        int[] fivenum = new int[5]; //5 is arbitrary to the problem / 5 é arbitrário para o problema

        printAndFill(fivenum);
        printNonDuplicatesEntradas(fivenum);
    }

    private static void printAndFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%n Enter number %d/%d:", i + 1,array.length);
            array[i] = scan.nextInt();
        }
    }

    private static boolean[] isNotUnique(int[] array, int index) {
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
            if (!isNotUnique(array, i)[i]) {
                System.out.println(array[i]);
            }
        }
    }
}



