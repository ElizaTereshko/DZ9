public class LackMoneyException  extends Exception{
    public LackMoneyException() {
    }

    public LackMoneyException(String message) {
        super(message);
    }

    public LackMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackMoneyException(Throwable cause) {
        super(cause);
    }

    public LackMoneyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
