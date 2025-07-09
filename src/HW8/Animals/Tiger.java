package HW8.Animals;

public class Tiger extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Tiger likes eat meat.");
        } else {
            System.out.println("Tiger doesn't like " + food + ".");
        }
    }

    @Override
    public void voice() {
        System.out.println("Tiger says: Roar!");
    }
}

