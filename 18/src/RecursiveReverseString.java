/*
    exercise 18.17
 */
public class RecursiveReverseString {
    public static void main(String[] args) {
        String string = "Reverse this string recursively.";
        stringReverse(string, "");
    }

    private static void stringReverse(String string, String reversed) {
        if (reversed.length() == string.length())
            System.out.println(reversed);
        else
            stringReverse(string, reversed + string.charAt(
                    string.length() - reversed.length() - 1
            ));
    }
}
