package HW11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String string3 = scanner.nextLine();
        int min = string1.length();
        int max = string1.length();
        int value = 1;
        String longest = string1;
        String shortest = string1;
        if (max < string2.length()) {
            max = string2.length();
            longest = string2;
        } else if (min > string2.length()) {
            min = string2.length();
            shortest = string2;
        } else {
            value++;
        }
        if (max < string3.length()) {
            max = string3.length();
            longest = string3;
        } else if (min > string3.length()) {
            min = string3.length();
            shortest = string3;
        } else {
            value++;
        }
        if (value > 2) {
            System.out.println("У вас " + value + " строки одинаковой длины равной " + max + ".");
        } else if (value == 2) {
            System.out.println("У вас " + value + " строки одинаковой длины.");
            if (string1.length() == string2.length() && string1.length() > string3.length()) {
                System.out.println("Две длинные строки: " + string1 + "," + string2 + ".Их длина равна " + max + ".");
                System.out.println("Самая короткая строка " + shortest + ".Eе длина равна " + min + ".");
            } else if (string1.length() == string3.length() && string1.length() > string2.length()) {
                System.out.println("Две длинные строки: " + string1 + "," + string3 + ".Их длина равна " + max + ".");
                System.out.println("Самая короткая строка " + shortest + ".Eе длина равна " + min + ".");
            } else if (string2.length() == string3.length() && string2.length() > string1.length()) {
                System.out.println("Две длинные строки: " + string2 + "," + string3 + ".Их длина равна " + max + ".");
                System.out.println("Самая короткая строка " + shortest + ".Eе длина равна " + min + ".");
            } else if (string1.length() == string2.length() && string1.length() < string3.length()) {
                System.out.println("Две короткие строки: " + string1 + "," + string2 + ".Их длина равна " + min + ".");
                System.out.println("Самая длинная строка " + longest + ".Eе длина равна " + max + ".");
            } else if (string1.length() == string3.length() && string1.length() < string2.length()) {
                System.out.println("Две короткие строки: " + string1 + "," + string3 + ".Их длина равна " + min + ".");
                System.out.println("Самая длинная строка " + longest + ".Eе длина равна " + max + ".");
            } else if (string2.length() == string3.length() && string2.length() < string1.length()) {
                System.out.println("Две короткие строки: " + string2 + "," + string3 + ".Их длина равна " + min + ".");
                System.out.println("Самая длинная строка " + longest + ".Eе длина равна " + max + ".");
            }
        } else {
            System.out.println("Самая длинная строка " + longest + ".Ее длина равна " + max + ".");
            System.out.println("Самая короткая строка " + shortest + ".Ее длина равна " + min + ".");
            scanner.close();
        }
    }
}