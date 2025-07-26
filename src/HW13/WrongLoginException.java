package HW13;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super("Некорректный логин.");
    }

    public WrongLoginException(String login) {
        super(login);
    }
}
