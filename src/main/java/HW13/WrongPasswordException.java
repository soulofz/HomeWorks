package HW13;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        super("Некорректный пароль.");
    }

    public WrongPasswordException(String password) {
        super(password);
    }
}
