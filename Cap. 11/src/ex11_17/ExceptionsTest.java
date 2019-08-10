package ex11_17;

public class ExceptionsTest {
    public static void main(String[] args) {
        int count = 0;
        do {
            try {
                System.out.println("\nThrowing exception");
                if (count == 0)
                    throw new ExceptionB();
                else
                    throw new ExceptionC();
            } catch (ExceptionA exceptionA) {
                count++;
                exceptionA.printStackTrace();
                System.out.printf("%s exception handled in catch(ExceptionA exceptionA)!%n", exceptionA.getClass().getName());
            }
        } while (count <= 1);
    }
}
