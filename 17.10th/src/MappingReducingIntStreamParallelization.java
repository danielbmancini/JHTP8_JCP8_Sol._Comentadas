import java.util.stream.IntStream;

/*
    exercise 17.14
 */
public class MappingReducingIntStreamParallelization {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values)
                        .map(num -> num*num)
                        .reduce(0, Integer::sum) );
    }
}
