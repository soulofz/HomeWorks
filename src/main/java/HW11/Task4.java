package HW11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String string3 = scanner.nextLine();
        String fullText = string1 + " " + string2 + " " + string3;
        String[] words = fullText.split(" ");
        for (String word : words) {
            boolean unique = true;
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) break;
            }
            if (unique) {
                System.out.println("Первое слово с уникальными символами: " + word);
                scanner.close();
                return;
            }
        }
        System.out.println("Слов с уникальными символами не найдено.");
        scanner.close();
    }
}