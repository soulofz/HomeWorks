package HW20.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив из чисел через запятую:");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int count = 0;
        for (String part : parts) {
            try {
                Integer.parseInt(part.trim());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: '" + part + "' не является числом.");
            }
        }
        int[] numbers = new int[count];
        int index = 0;
        for (String part : parts) {
            try {
                numbers[index++] = Integer.parseInt(part.trim());
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                continue;
            }
        }
        int[] arrayForInsertion = Arrays.copyOf(numbers, numbers.length);
        int[] arrayForSelection = Arrays.copyOf(numbers, numbers.length);
        int[] arrayForBubble = Arrays.copyOf(numbers, numbers.length);
        Thread insertionThread = new Thread(new InsertionSorter(arrayForInsertion));
        Thread selectionThread = new Thread(new SelectionSorter(arrayForSelection));
        Thread bubbleThread = new Thread(new BubbleSorter(arrayForBubble));
        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();
        insertionThread.join();
        selectionThread.join();
        bubbleThread.join();
        System.out.println("InsertionSorter result:" + Arrays.toString(arrayForInsertion));
        System.out.println("SelectionSorter result:" + Arrays.toString(arrayForSelection));
        System.out.println("BubbleSorter result:" + Arrays.toString(arrayForBubble));
    }
}
