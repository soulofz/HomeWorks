package HW11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string1 = scanner.nextLine();
        String[] words = string1.trim().replaceAll("[!`@~#$%^&*;/<>.,?:()]", "").toLowerCase().split(" ");
        System.out.println("Введите номер слова:");
        int index = scanner.nextInt();
        System.out.println();
        if (index > words.length) {
            System.out.println("Введенное число превышает количество слов в предложении.");
            return;
        } else if (index < 1) {
            System.out.println("Число должно быть целым и положительным.");
        }
        String word = words[index - 1];
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("Слово " + word + " не является палиндромом.");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Слово " + word + " является палиндромом.");
    }
}