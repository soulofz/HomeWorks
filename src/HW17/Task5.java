package HW17;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> rollback = () -> {
            try (Scanner scanner = new Scanner(System.in);) {
                System.out.println("Введите строку:");
                String input = scanner.nextLine();
                String[] parts = input.trim().split("\\s");
                LinkedList<String> reversedArray = new LinkedList<>();
                for (String part : parts) {
                    reversedArray.addFirst(part);
                }
                return String.join(" ", reversedArray);
            } catch (Exception e) {
                System.out.println("Ошибка ввода данных.");
                return null;
            }
        };
        String result = rollback.get();
        System.out.println(result);
    }
}
