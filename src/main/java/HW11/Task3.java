package HW11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String string3 = scanner.nextLine();
        double numberOfRows = 3.0;
        double average = (string1.length() + string2.length() + string3.length()) / numberOfRows;
        boolean result = false;
        if (string1.length() < average) {
            System.out.println(string1 + ".Ее длина равна " + string1.length());
            result = true;
        }
        if (string2.length() < average) {
            System.out.println(string2 + ".Ее длина равна " + string2.length());
            result = true;
        }
        if (string3.length() < average) {
            System.out.println(string3 + ".Ее длина равна " + string3.length());
            result = true;
        }
        if (!result) {
            System.out.println("Нет подходящих строк.");
        }
        scanner.close();
    }
}
