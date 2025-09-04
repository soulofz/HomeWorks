package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1 || num == 2 || num == 12) {
            System.out.println("Зима");
        } else if (num >= 3 && num <= 5) {
            System.out.println("Весна");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Лето");
        } else if (num >= 9 && num <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Значение не валидно");
        }
        scanner.close();
    }
}
