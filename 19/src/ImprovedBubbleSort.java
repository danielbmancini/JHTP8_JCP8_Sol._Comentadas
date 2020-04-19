import java.util.Arrays;
import java.util.Random;

/*
    exercise 19.6
 */
public class ImprovedBubbleSort {

    private static int[] array;

    private static void initArray(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(90) + 10;
    }

    private static void sort(int endIndex) {
        if (endIndex > 1) {
            int counter = 0;
            for (int i = 0; i < endIndex - 1; i++)
                if (array[i + 1] < array[i]) {
                    swap(i + 1, i);
                    counter++;
                }
            if (counter == 0)
                return;
            sort(endIndex - 1);
        }
    }

    private static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int size = 10;
        initArray(size);
        System.out.printf("%nRandomly generated array: %s", Arrays.toString(array));
        sort(array.length);
        System.out.printf("%nSorted array: %s", Arrays.toString(array));
    }
}
