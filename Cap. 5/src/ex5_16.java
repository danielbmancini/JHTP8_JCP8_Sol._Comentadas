import java.util.Random;
public class ex5_16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nu1a30 = rand.nextInt(30)+1;

                for(int i = 0; i < nu1a30; i++)
                    System.out.print("*"); /*o programa do enunciado é um uso direto do mesmo tipo de algoritmo, com a classe Scanner em vez de
                    Random, e com um for para cada entrada de dado.*/
    }
}
