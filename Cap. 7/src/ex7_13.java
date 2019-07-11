public class ex7_13 { //indexing in a bidimensional array
    public static void main(String[] args) {
        int[][] biarray = new int[3][5];

        for (int i = 0; i < biarray.length; i++) {
        for (int j = 0; j < biarray[j].length; j++)
            biarray[i][j] = 0;
        /*writing explanations (even trivial ones) is cool: two nested for's of length n2 and n2 generate n1*n2 pairs (i,j).
          in the form (0,0), (0,1) , (0,2) ... (n1, n2). */
        //in this sense, each element of the array 'biarray' can be assigned to one of these pairs: e1 = (0,0), e2 = (0,1) (...)
        // not really sure of the function of this class, i just wanna write my obvious a*s explanations
        }
    }
}
