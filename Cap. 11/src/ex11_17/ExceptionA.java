package ex11_17;

public class ExceptionA extends Exception {
    ExceptionA() {
        super();
    }

    @Override
    public String toString() {
        return "ExceptionA thrown.";
    }
}
