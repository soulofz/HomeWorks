package HW3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= t; i++) {
            result = result + i;
        }
        System.out.println(result);
        scanner.close();

    }
}
