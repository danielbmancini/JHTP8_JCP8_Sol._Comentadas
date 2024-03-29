/*
    exercise 20.6, extracted from fig. 20.3 and edited.
 */
public class OverloadingGenericMethodNongeneric {
    public static void main(String[] args)
    {
// create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array

        String[] stringArray = {"one","two","three","four","five","six","seven","eight"};
        printArray(stringArray);
    }
    // generic method printArray
    public static <T> void printArray(T[] inputArray)
    {
// display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();

    }

    public static void printArray(String[] stringArray)
    {
        System.out.printf("%nArray stringArray contains:%n");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("%s   ",stringArray[i]);

            if(i % 4 == 3)
            System.out.printf("%n");
        }
    }
}
