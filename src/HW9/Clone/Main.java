package HW9.Clone;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car copy = car.clone();
        System.out.println(car);
        System.out.println(copy);
    }
}
