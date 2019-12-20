/**
 * exercise 5.21
 */

public class PythagoreanTriples { /* lista, por força bruta, todos os ternos pitagóricos a² + b² = c², c <= 500 , desconsiderando permutações de a e b.*/
    public static void main(String[] args) {

        int[] i_arm = new int[500];
        int[] f_arm = new int[500];

        for (int i = 0; i <= 500; i++) //i = side 1
        {
            for (int f = 0; f <= 500; f++) // f = side 2
            {
                for (int g = 0; g <= 500; g++) // g = hypotenuse
                {
                    if (i * i + f * f == g * g && i != 0 && f != 0 && f != i_arm[f] && i != f_arm[i]) {

                        i_arm[i] = i; // armazena uma combinação (i,f), para posteriormente desconsiderar a permutação (f,i)
                        f_arm[f] = f;  

                        System.out.println(i + ", " + f + ", " + g + ".");
                    }
                }
            }
        }
    }
}
