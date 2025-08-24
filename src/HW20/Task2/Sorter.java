package HW20.Task2;

public abstract class Sorter implements Runnable {
    protected int[] array;

    public Sorter(int[] array) {
        this.array = array;
    }
}
