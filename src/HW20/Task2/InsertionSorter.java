package HW20.Task2;

public class InsertionSorter extends Sorter{

    public InsertionSorter(int[] array){
        super(array);
    }

    @Override
    public void run() {
        System.out.println("InsertionSorter started.");
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("InsertionSorter ended.");
    }
}
