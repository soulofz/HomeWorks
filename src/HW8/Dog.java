package HW8;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Dog likes it.");
        } else {
            System.out.println("Dog doesn't like " + food + ".");
        }
    }
}
