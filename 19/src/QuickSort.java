import java.util.Arrays;
import java.util.Random;

/*
    exercise 19.10
 */
public class QuickSort {
    private static int[] array;

    private static void initArray(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(100);
    }

    private static void quickSortHelper(int lo, int hi) {
        if (hi > lo) {
            int pivot = array[lo];
            int right = hi - 1;
            int left = lo;
            while (right > left) { //swaps lesser elements to left of pivot and greater to the right
                while (left < hi && array[left] <= pivot) left++;
                while (right > lo && array[right] > pivot) right--;
                if (right > left)
                    swap(right, left); //here, array[right] should be in the left partition and array[left] in the right
            }
            swap(right, lo); //swaps pivot to the correct position (middle of the lesser-to-greater elements)
            quickSortHelper(lo, right);
            quickSortHelper(right + 1, hi);
        }

    }

    private static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSort() {
        quickSortHelper(0, array.length);
    }

    public static void main(String[] args) {
        int size = 10;
        initArray(size);
        System.out.printf("%nRandomly generated array: %s", Arrays.toString(array));
        quickSort();
        System.out.printf("%nSorted array: %s", Arrays.toString(array));
    }
}
