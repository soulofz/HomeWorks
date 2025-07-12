package HW9.Figures;

public class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("The sides do not form a triangle.");
        }
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}