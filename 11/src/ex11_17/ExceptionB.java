package ex11_17;

public class ExceptionB extends ExceptionA {
    public ExceptionB() {
        super();
    }

    @Override
    public String toString() {
        return "ExceptionB thrown.";
    }
}
