package HW17;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        double course = 3.30;
        Function<String, Double> converter = input -> {
            try {
                String[] parts = input.trim().split("\\s");
                double bynAmount = Double.parseDouble(parts[0]);
                return bynAmount / course;
            } catch (Exception e) {
                System.out.println("Неверный формат строки.");
                return 0.0;
            }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество белорусских рублей для валютнообменной операции в формате (*сумма* BYN):");
        String input = scanner.nextLine();
        double usdAmount = converter.apply(input);
        System.out.printf("Количество долларов: " + usdAmount + " USD");
        scanner.close();
    }
}

