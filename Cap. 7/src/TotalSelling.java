import java.util.Random;

/*
    exercise 7.20
 */
public class TotalSelling { //formats differently
    private static Random random = new Random();

    public static void main(String[] args) {
        int[][] sales = new int[4][5]; /*4 and 5 are arbitrary - the positions [i][j] must represent a sold quantity of the i vendor, for the j product.
                                         Also, you cant declare this array using '{Objects}'. */
        multiDimensionalArrayFill(sales);
        mostrarUmaNota(sales);

    }

    private static void multiDimensionalArrayFill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); //10 is an arbitrary bound - generates a random sold quantity between 0 and 10.
            }

        }
    }

    private static void mostrarUmaNota(int[][] array) { //unreadable - shows a grade
        int[] storingElements = new int[array[0].length];
        System.out.print(" ");
        for (int i = 1; i <= array[0].length; i++)
            System.out.printf("%6d", i);
        System.out.println("      Total líquido\n");
        for (int i = 0; i < array.length; i++) {
            int printingCounter = 0;
            int printingCounterDupe = 0;
            System.out.print(i + 1);
            while (printingCounterDupe < array[0].length) {
                storingElements[printingCounter] = array[i][printingCounter];
                printingCounterDupe++;
            }
            while (printingCounter < array[0].length) {
                storingElements[printingCounter] = array[i][printingCounter];
                System.out.print("     " + array[i][printingCounter]);
                if (printingCounter == array[0].length - 1)
                    System.out.print("           " + somar(storingElements));
                printingCounter++;
            }
            System.out.println("\n");
        }
    }

    private static int somar(int[] storedElements) //sums elements from an array storedElements
    {
        int sum = 0;
        for (int i = 0; i < storedElements.length; i++)
            sum += storedElements[i];

        return sum;
    }
}