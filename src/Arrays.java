import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Создание массива(Условие)
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arrInt = new int[length];

        // Заполнение массива случайными числами(Условие)
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) (Math.random() * 100);
        }

        // Вывод массива в прямом порядке(Задача 1)
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();

        //Вывод массива в обратном порядке(Задача 1)
        System.out.println("Массив в обратном порядке:");
        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();

        // Поиск минимального и максимального элемента + их индекса(Задача 2,3)
        int min = arrInt[0];
        int max = arrInt[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
                minIndex = i;
            }
            if (arrInt[i] > max) {
                max = arrInt[i];
                maxIndex = i;
            }
        }
        System.out.println("Минимальный элемент: " + min + " (индекс " + minIndex + ")");
        System.out.println("Максимальный элемент: " + max + " (индекс " + maxIndex + ")");

        //Проверка на нулевые элементы(Задача 4)
        int size = 0;
        for (int number : arrInt) {
            if (number == 0) {
                size++;
            }
        }
        if (size > 0) {
            System.out.println("Количество нулевых элементов: " + size);
        } else {
            System.out.println("Нулевых элементов - нет.");
        }

        //ПРоверка на последовательность(Задача 6)
        boolean inc = true;
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < arrInt[i - 1]) {
                inc = false;
                break;
            }
        }
        if (inc == true) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }

        // Перестановка элементов(Задача 5)
        for (int i = 0; i < arrInt.length / 2; i++) {
            int temp = arrInt[i];
            arrInt[i] = arrInt[arrInt.length - 1 - i];
            arrInt[arrInt.length - 1 - i] = temp;
        }

        // Вывод массива после перестановки(Задача 5)
        System.out.println("Массив после перестановки элементов:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}


