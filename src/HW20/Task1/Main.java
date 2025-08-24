package HW20.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив из чисел через запятую:");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int count = 0;
        for (String part : parts) {
            try {
                Integer.parseInt(part.trim());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: '" + part + "' не является числом.");
            }
        }
        int[] numbers = new int[count];
        int index = 0;
        for (String part : parts) {
            try {
                numbers[index++] = Integer.parseInt(part.trim());
            } catch (NumberFormatException e) {
                continue;
            }
        }
        MinFinder minFinder = new MinFinder(numbers);
        MaxFinder maxFinder = new MaxFinder(numbers);
        minFinder.start();
        maxFinder.start();
        minFinder.join();
        maxFinder.join();
        System.out.println("Минимум: " + minFinder.getResult());
        System.out.println("Mаксимум: " + maxFinder.getResult());
        scanner.close();
    }
}
