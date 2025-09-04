package HW15.Task2;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        if (!animals.isEmpty())
            animals.removeLast();
        else {
            System.out.println("В коллекции должен быть хотя бы один элемент.");
        }
    }

    public void showInfo() {
        System.out.println(animals);
    }
}
