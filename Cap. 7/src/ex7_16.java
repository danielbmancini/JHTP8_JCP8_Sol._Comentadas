public class ex7_16 {
    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        System.out.println(sum); //i wrote a super weird code before writing the present code
    }
}