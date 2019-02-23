package lecture.lecture6.exception.chain;

public class FieldChecker extends RuntimeException {

    private String message;

    public FieldChecker(final String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "FieldChecker{" +
               "message='" + message + '\'' +
               '}';
    }
}
