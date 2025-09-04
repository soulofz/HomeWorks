package HW20.Task1;

public abstract class Finder extends Thread {
    protected int[] array;
    protected int result;

    public Finder(int[] array) {
        this.array = array;
    }

    public int getResult(){
        return result;
    }


}
