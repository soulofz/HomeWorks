package HW20.Task2;

public class SelectionSorter extends Sorter {
    public SelectionSorter(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        System.out.println("SelectionSorter started.");
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = array[minIndex];
            }
        }
        System.out.println("SelectionSorter ended.");
    }
}
