package HW15.Task2;

public class Main {
    public static void main(String[] args) {
        AnimalCollection zoo = new AnimalCollection();
        zoo.addAnimal("Elephant");
        zoo.addAnimal("Tiger");
        zoo.addAnimal("Lion");
        zoo.showInfo();
        zoo.removeAnimal();
        zoo.showInfo();
    }
}
