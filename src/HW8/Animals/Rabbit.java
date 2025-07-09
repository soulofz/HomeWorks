package HW8.Animals;

public class Rabbit extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Rabbit likes eat grass.");
        } else {
            System.out.println("Rabbit doesn't like " + food + ".");
        }
    }

    @Override
    public void voice() {
        System.out.println("Rabbit says: Urrr!");
    }
}

