/*
    exercise 20.5, extracted from book fig. 20.3 and edited.
 */
public class OverloadedGenericMethodPrintArray {
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

        System.out.printf("%n%nSecond printArray test:");

        printArray(1,4,integerArray);
        printArray(0,7,doubleArray);
        printArray(-1,2,characterArray);
    }
    // generic method printArray
    public static <T> void printArray(T[] inputArray)
    {
// display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }

    public static <T> void printArray(int lowSubscript, int highSubscript, T[] inputArray) //exclusive range
    {
        if(highSubscript > inputArray.length || lowSubscript < 0)
            throw new InvalidSubscriptException();
        else {
            System.out.printf("%nNumber of elements printed: %d%n",highSubscript - lowSubscript);

            for (int i = lowSubscript; i < highSubscript ; i++)
                System.out.printf("%s ", inputArray[i]);
            System.out.println();
        }
    }
}
