import java.util.*;

/*
    exercise 19.7
 */
public class BucketSort {
    private static ArrayList<ArrayList<Integer>> buckets;
    private static int[] data;

    private static void initArrays(int size) {
        buckets = new ArrayList<>();
        data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            data[i] = random.nextInt(100);
        for (int i = 0; i < 10; i++)
            buckets.add(new ArrayList<>());

    }

    private static ArrayList<Integer> sort() {
        ArrayList<Integer> sorted = new ArrayList<>(data.length);
        for (int integer : data) //fills buckets
            buckets.get(integer / 10)
                    .add(integer);
        buckets.forEach(bucket -> bucket.sort(Comparator.naturalOrder())); //sorts buckets individually
        buckets.forEach(sorted::addAll); //concatenates buckets 0 to (size)
        return sorted;
    }

    public static void main(String[] args) {
        int size = 10;
        initArrays(size);
        System.out.printf("%nRandomly generated array: %s", Arrays.toString(data));
        System.out.printf("%nSorted array: %s", sort());
    }

}
