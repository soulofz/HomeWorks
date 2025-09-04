package HW9.Figures;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        Rectangle rectangle = new Rectangle(5, 4);
        a = rectangle.calculatePerimeter();
        b = rectangle.calculateArea();
        System.out.println(a);
        System.out.println(b);

        Triangle triangle = new Triangle(1, 1, 2);
        a = triangle.calculatePerimeter();
        b = triangle.calculateArea();
        System.out.println(a);
        System.out.println(b);

        Circle circle = new Circle(6.7);
        a = circle.calculatePerimeter();
        b = circle.calculateArea();
        System.out.println(a);
        System.out.println(b);


        Figure[] figures = new Figure[5];
        Random random = new Random();
        for (int i = 0; i < figures.length; i++) {
            int figureType = random.nextInt(3);
            int size1 = random.nextInt(1, 11);
            int size2 = random.nextInt(1, 11);
            int size3 = random.nextInt(1, 11);
            switch (figureType) {
                case 0 -> figures[i] = new Rectangle(size1, size2);
                case 1 -> {
                    if (size1 + size2 <= size3 || size1 + size3 <= size2 || size2 + size3 <= size1) {
                        throw new IllegalArgumentException("The sides do not form a triangle.");
                    }
                    figures[i] = new Triangle(size1, size2, size3);
                }
                case 2 -> figures[i] = new Circle(size1);
            }
        }
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }
        System.out.println("Total perimeter = " + totalPerimeter);
    }
}