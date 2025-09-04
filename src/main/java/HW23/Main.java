package HW23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите формат парсинга 1 (SAX) или 2 (DOM) :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1){
            System.out.println("1");
        }else if (input == 2){
            System.out.println("2");
        } else {
            System.out.println("Неверное число.");
        }
    }
}
