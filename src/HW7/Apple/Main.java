package HW7.Apple;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Apple apple = new Apple();
        apple.printColor();

        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Красный");

        apple.printColor();
    }
}
