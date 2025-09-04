package HW3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t < -20) {
            System.out.println("Холодно");
        } else {
            System.out.println("Нормально");
        }
        scanner.close();
    }
}
