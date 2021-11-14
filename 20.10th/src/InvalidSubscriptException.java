public class InvalidSubscriptException extends RuntimeException{
    public InvalidSubscriptException()
    {
        this("Invalid subscript(s).");
    }
    public InvalidSubscriptException(String message)
    {
        super(message);
    }
}
