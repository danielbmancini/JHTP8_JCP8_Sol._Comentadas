import java.util.Arrays;
public class
ex7_27 {
    public static void main(String[] args) {
        boolean[] values = new boolean[1000];
        Arrays.fill(values,true);

        for(int i = 2; i < values.length; i++)
          for(int indexC = i; indexC < values.length; indexC++) {
              if (i != indexC && indexC % i == 0){
                  values[indexC] = false;}
          }
        for(int i = 2; i < values.length; i++)
            if(values[i])
                System.out.print(i + "  ");

    }
}