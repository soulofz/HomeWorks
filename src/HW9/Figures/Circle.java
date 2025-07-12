package HW9.Figures;

public class Circle extends Figure {
    private final double radius;

    Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

