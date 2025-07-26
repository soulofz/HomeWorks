package HW13;

public class AuthorizationCheck {
    protected static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Логин должен быть короче 20 символов и не содержать пробелов.");
            }
            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Пароль должен быть короче 20 символов, не содержать пробелов и содержать хотя бы одну цифру.");
            }
            if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException("Пароли должны совпадать.");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e);
            System.exit(0);
            return false;
        } finally {
            System.out.println("Выполняется finally."); // Чтобы оно не выполнилось, по условию задачи должны быть введены неверные данные.
        }
    }
}
