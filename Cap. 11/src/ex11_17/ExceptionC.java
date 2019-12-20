package ex11_17;

public class ExceptionC extends ExceptionB {
    public ExceptionC() {
        super();
    }

    @Override
    public String toString() {
        return "ExceptionC thrown.";
    }
}
