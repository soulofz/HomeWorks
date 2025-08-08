package HW17;

import java.util.Scanner;
import java.util.function.Consumer;


public class Task4 {
    public static void main(String[] args) {
        double course = 3.30;
        Consumer<String> converter = input -> {
            try {
                String[] parts = input.trim().split("\\s");
                double number = Double.parseDouble(parts[0]);
                System.out.println("Количество доларов: " + (number / course) + " USD");
            } catch (Exception e) {
                System.out.println("Неверный формат данных");
            }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество белорусских рублей для валютнообменной операции в формате (*сумма* BYN):");
        String input = scanner.nextLine();
        converter.accept(input);
        scanner.close();
    }
}


