package HW10;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Misha", "Shevchuk", 25);
        User user2 = new User("Misha", "Shevchuk", 25);
        User user3 = new User("Alex", "Gilep", 24);
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.toString());
        User user4 = (User) user1.clone();
        User user5 = (User) user1.deepClone();
        user1.setId(2);
        System.out.println(user1);
        System.out.println(user4);
        System.out.println(user5);

    }
}
