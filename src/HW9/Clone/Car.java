package HW9.Clone;

public class Car implements Cloneable { //Добавляем чтобы был клонируемый
    private String mark = "Porsche";
    private String model = "911 Turbo S";
    private int year = 2025;

    //Переопределение метода clone
    public Car clone() {
        try {
            return (Car) super.clone(); //чтобы возвращало клон этого класса
        } catch (CloneNotSupportedException e) { //ошибка = что класс не клонируемый(первая пометка(Cloneable))
            throw new RuntimeException("Clone is not supported"); // выдает ошибку с надписью, что клон не поддерживается
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}