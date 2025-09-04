package HW8.Animals;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Dog likes eat meat.");
        } else {
            System.out.println("Dog doesn't like " + food + ".");
        }
    }

    @Override
    public void voice() {
        System.out.println("Dog says: Woof!");
    }
}
