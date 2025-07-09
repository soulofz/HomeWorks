package HW8.Animals;

public abstract class Animal {

    public void eat(String food) {
        System.out.println("Animal eats " + food);
    }

    public void voice() {
        System.out.println("Animal makes sound.");
    }

}