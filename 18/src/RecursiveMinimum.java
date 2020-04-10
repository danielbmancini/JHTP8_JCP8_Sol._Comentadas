/*
    exercise 18.18
 */
public class RecursiveMinimum {
    public static void main(String[] args) {
        int[] randomArray = {92, 32, 45, 32, 55, 213, 23, 91};
        System.out.printf("%nArray minimum is %d.", recursiveMinimum(randomArray, randomArray[0], 0));
    }

    private static int recursiveMinimum(int[] array, int min, int index) {
        if (index + 1 == array.length)
            return min;
        else if (array[index] < min)
            return recursiveMinimum(array, array[index], index + 1);
        else
            return recursiveMinimum(array, min, index + 1);
    }
}
