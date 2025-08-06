package HW16;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество срок в массиве:");
        int number = Integer.parseInt(scanner.nextLine());
        String[] lines = new String[number];
        System.out.println("Введите строки массива");
        for (int i = 0; i < number; i++) {
            lines[i] = scanner.nextLine();
        }
        HashMap<String, String> map = new HashMap<>();
        for (String line : lines) {
            if (!line.isBlank()) {
                if (map.containsKey(line)) {
                    break;
                } else {
                    String key = String.valueOf(line.charAt(0));
                    String value = String.valueOf(line.charAt(line.length() - 1));
                    map.put(key, value);
                }
            }
        }
        System.out.println(map);
        scanner.close();
    }
}

