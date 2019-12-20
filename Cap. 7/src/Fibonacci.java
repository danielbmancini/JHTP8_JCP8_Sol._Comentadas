import java.util.Scanner;
//iterative version
//exercise 7.29
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the n-th sequence number:");
        int n = scan.nextInt();
        if (n == 0 || n == 1)
            System.out.println(n + "-th number in the Fibonacci sequence: " + n);
        else {
            n += 1;
            int[] sequence = new int[n];
            sequence[0] = 0;
            sequence[1] = 1;
            System.out.print("\n" + (n - 1) + "-th number in Fibonacci sequence: ");
        for (int i = 2; i < n  ; i++)
            sequence[i] = sequence[i-1] + sequence[i-2];

        System.out.print(sequence[n-1]);}
    }
}