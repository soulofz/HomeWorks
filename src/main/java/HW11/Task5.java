package HW11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            char currentChar = string1.charAt(i);
            result.append(currentChar).append(currentChar);
        }
        System.out.println(result.toString());
    }
}
