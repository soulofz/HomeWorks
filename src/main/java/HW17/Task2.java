package HW17;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для массива через пробел:");
        String input = scanner.nextLine();
        String[] numbers = input.trim().split("\\s");
        Predicate<Integer> positive = n -> n > 0;
        boolean foundPositive = false;
        System.out.println("Положительные числа:");
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (positive.test(num)) {
                System.out.print(num + " ");
                foundPositive = true;
            }
        }
        if (!foundPositive) {
            System.out.println("Положительных цифр не введено.");
        }
        scanner.close();
    }
}
