package HW11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк для ввода:");
        int count = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[count];
        System.out.println("Введите строки:");
        for (int i = 0; i < count; i++) {
            strings[i] = scanner.nextLine();
        }
        int minLength = strings[0].length();
        int maxLength = strings[0].length();
        for (int i = 1; i < count; i++) {
            int length = strings[i].length();
            if (length < minLength) {
                minLength = length;
            }
            else if (length > maxLength) {
                maxLength = length;
            }
        }
        int minCount = 0;
        int maxCount = 0;
        System.out.println("\nРезультат:");
        for (int i = 0; i < count; i++) {
            if (strings[i].length() == maxLength) {
                maxCount++;
            }
            if (strings[i].length() == minLength) {
                minCount++;
            }
        }
        if (minLength == maxLength) {
            System.out.println("Все строки одинаковой длины: " + maxLength);
        } else {
            System.out.println(maxCount + " строка(а) максимальной длины (" + maxLength + "):");
            for (int i = 0; i < count; i++) {
                if (strings[i].length() == maxLength) {
                    System.out.println(strings[i]);
                }
            }

            System.out.println(minCount + " строк(а) минимальной длины (" + minLength + "):");
            for (int i = 0; i < count; i++) {
                if (strings[i].length() == minLength) {
                    System.out.println(strings[i]);
                }
            }
        }

        scanner.close();
    }
}