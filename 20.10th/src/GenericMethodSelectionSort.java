import java.security.SecureRandom;
import java.util.Arrays;
/*
    exercise 20.4, extracted from book chapter 19 fig. 19.4 and edited.
 */
public class GenericMethodSelectionSort {
    public static <T extends Comparable<T>> void selectionSort(T[] data)
    {
        for (int i = 0; i < data.length - 1; i++)
        {
            int smallest = i; // first index of remaining array
// loop to find index of smallest element
            for (int index = i + 1; index < data.length; index++)
                if (data[index].compareTo(data[smallest]) < 0)
                    smallest = index;
            swap(data, i, smallest); // swap smallest element into position
            printPass(data,i + 1, smallest); // output pass of algorithm
        }
    } // end method selectionSort
    // helper method to swap values in two elements
    private static <T extends Comparable<T>> void swap(T[] data, int first, int second)
    {
        T temporary = data[first]; // store first in temporary
        data[first] = data[second]; // replace first with second
        data[second] = temporary; // put temporary in second
    }
    // print a pass of the algorithm
    private static <T extends Comparable<T>> void printPass(T[] data, int pass, int index)
    {
        System.out.printf("after pass %2d: ", pass);
// output elements till selected item
        for (int i = 0; i < index; i++)
            System.out.printf("%s ", data[i]);
        System.out.printf("%s* ", data[index]); // indicate swap
// finish outputting array
        for (int i = index + 1; i < data.length; i++)
            System.out.printf("%s ", data[i]);
        System.out.printf("%n           "); // for alignment
// indicate amount of array that’s sorted
        for (int j = 0; j < pass; j++)
            System.out.print("-- ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Integer[] data = new Integer[10]; // create array
        Float[] data2 = new Float[10];
        SecureRandom generator = new SecureRandom();
        for (int i = 0; i < data.length; i++) // populate array
            data[i] = 10 + generator.nextInt(90);
        for (int i = 0; i < data2.length; i++)
            data2[i] = 10 +  generator.nextFloat(90);

        passArray(data);
        passArray(data2);
    }

    private static <T extends Comparable<T>> void passArray(T[] data)
    {
        System.out.printf("Unsorted array:%n%s%n%n",
                Arrays.toString(data)); // display array
        selectionSort(data); // sort array
        System.out.printf("Sorted array:%n%s%n%n",
                Arrays.toString(data)); // display array
    }
} // end

