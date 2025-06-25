import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWArrays2 {
    public static void main(String[] args) {
        //Task 1
        Random random = new Random();
        int[][] array = new int[5][2];
        System.out.println("Первоначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10, 21);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число, которое нужно прибавить к эллементам массива");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        System.out.println("Массив после прибавления: ");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = array[r][c] + num;
                sum += array[r][c];
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех эллементов массива равна : " + sum);
        scanner.close();

        //Task 2
        String[][] chess = new String[8][8];
        for (int b = 0; b < chess.length; b++) {
            for (int w = 0; w < chess[b].length; w++) {
                if ((b + w) % 2 != 0) {
                    chess[b][w] = "B";
                } else
                    chess[b][w] = "W";
                System.out.print(chess[b][w] + " ");
            }
            System.out.println();
        }

        //Task 3
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите два числа(размер массива):");
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        int c = 1;
        int[][] snake = new int[a][b];
        for (int z = 0; z < a; z++) {
            if (z % 2 == 0) {
                for (int x = 0; x < b; x++) {
                    snake[z][x] = c++;
                }
            } else {
                for (int x = b - 1; x >= 0; x--) {
                    snake[z][x] = c++;
                }
            }
        }
        for (int z = 0; z < a; z++) {
            for (int x = 0; x < b; x++) {
                System.out.print(snake[z][x] + " ");
            }
            System.out.println();
        }
        scanner1.close();
    }
}
