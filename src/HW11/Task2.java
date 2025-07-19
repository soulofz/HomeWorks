package HW11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String string3 = scanner.nextLine();
        String temp;
        if (string1.length() > string2.length()) {
            temp = string1;
            string1 = string2;
            string2 = temp;
        }
        if (string2.length() > string3.length()) {
            temp = string2;
            string2 = string3;
            string3 = temp;
        }
        if (string1.length() > string2.length()) {
            temp = string1;
            string1 = string2;
            string2 = temp;
        }
        System.out.println("Строки по возрастанию длины:");
        System.out.println(string1 + "(длина " + string1.length() + ")");
        System.out.println(string2 + "(длина " + string2.length() + ")");
        System.out.println(string3 + "(длина " + string3.length() + ")");
        scanner.close();
    }
}
