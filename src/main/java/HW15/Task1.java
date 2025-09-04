package HW15;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("[^0-9]+");
        Set<String> unique = new LinkedHashSet<>();
        for (String number : numbers) {
            unique.add(number);
        }
        System.out.println(unique);
        scanner.close();
    }
}
