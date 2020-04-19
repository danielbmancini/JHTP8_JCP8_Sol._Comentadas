import java.util.Arrays;
import java.util.Random;

/*
    exercise 19.9
 */
public class RecursiveBinarySearch {
    private static int[] data;

    private static void initArray(int size) {
        data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            data[i] = random.nextInt(100);
    }

    private static int recursiveSearch(int lo, int hi, int key) {
        int found = key == data[lo] ? lo :
                key == data[hi] ? hi : -1;
        if (found == -1 && lo != hi) {
            int middle1 = (lo + hi) / 2;
            int middle2 = middle1 + 1;
            if (key > data[middle1])
                return recursiveSearch(middle2, hi, key);
            else
                return recursiveSearch(lo, middle1, key);
        }
        return found;
    }

    private static int recursiveSearch(int key) {
        return recursiveSearch(0, data.length - 1, key);
    }

    public static void main(String[] args) {
        int key = 50;
        int size = 10;
        initArray(size);
        Arrays.sort(data);
        System.out.printf("%nSorted randomly generated array: %s", Arrays.toString(data));
        System.out.printf("%nIndex of key (%d) or -1 if it doesn't exist: %d", key, recursiveSearch(key));
    }
}
