package HW17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите дату рождения в фоомате DD.MM.YYYY:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate hundredYears = birthday.plusYears(100);
        System.out.println("Вам исполнится 100 лет " + hundredYears);
        scanner.close();
    }
}
