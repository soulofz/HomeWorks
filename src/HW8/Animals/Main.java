package HW8.Animals;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        rabbit.voice();
        tiger.voice();
        dog.voice();
        rabbit.eat("GRASS");
        tiger.eat("Grass");
        dog.eat("grAss");
        rabbit.eat("meat");
        tiger.eat("meaT");
        dog.eat("MEAT");
    }
}
