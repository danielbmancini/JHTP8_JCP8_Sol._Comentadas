/*
 * exercise 5.12
 */
public class OddNumberProduct {
    private static int[] umaquinze = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public static int multiply(int[] arr) {
        int pro = 1;
        for (int i = 0; i < arr.length; i++)
            pro = pro * arr[i];
        return pro;
    }

    public static void main(String[] args) {

        int[] i1 = new int[(umaquinze.length - 1)/2];


        for (int i = 0; i < umaquinze.length; i++) {
            if (umaquinze[i] % 2 == 1)
                i1[(i-1)/2] = umaquinze[i];
        }
    System.out.println(multiply(i1));
    }
}
