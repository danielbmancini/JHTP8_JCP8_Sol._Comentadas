package ex7_24;
//non-generalized for nxn
//TODO: finish
import java.util.Arrays;

class ex7_24 {
    static int queenCount = 0;
    private static int[][] table = new int[8][8];
    private static int tableCount = 2;

    static {
        for (int i = 0; i < 8; i++)
            Arrays.fill(table[i], 0);
    }


    static void insert(int a, int b) { //a = row, b = column
        table[a][b] = 1;
        diagsFill(a, b);

        for (int i = 0; i <= 7; i++) {
            if(table[a][i] != 1 && table[i][b] != 1 )
            {table[a][i] = tableCount;
            table[i][b] = tableCount;}
        }
    }


    private static void diagsFill(int a, int b) {
        int c = a;
        int d = b;
        while (c <= 7 && d <= 7) {
            if (c != a && d != b && table[c][d] != 1)
                table[c][d] = tableCount;
            c++;
            d++;
        }
        c = a;
        d = b;
        while (c >= 0 && d >= 0) {
            if (c != a && d != b && table[c][d] != 1)
                table[c][d] = tableCount;
            c--;
            d--;
        }
        c = a;
        d = b;

        while (c <= 7 && d >= 0) {
            if (c != a && d != b && table[c][d] != 1)
                table[c][d] = tableCount;
            c++;
            d--;
        }
        c = a;
        d = b;
        while (c >= 0 && d <= 7) {
            if (c != a && d != b && table[c][d] != 1)
                table[c][d] = tableCount;
            c--;
            d++;
        }
    }

    static int[] verifyTable(int[] random) //returns where to use insert() method
    {
        int[] insertUsage = {0, 0};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (table[i][j] == 0) {
                    insertUsage[0] = i;
                    insertUsage[1] = j;
                }
                if(table[i][j] == 1)
                    queenCount++;
            }
        }
        if(insertUsage[0] != 7 && insertUsage[1] != 7)
        return insertUsage;
        else
            return random;
    }
    static void show()
    {
        for (int i = 0; i <8 ; i++) {
            System.out.println();
            for (int j = 0; j <8 ; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
    }

    static void countQueens() {
        if (queenCount > 0)
            System.out.println("Queen count:" + queenCount + ".");
    }
}