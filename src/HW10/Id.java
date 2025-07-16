package HW10;

public class Id {
    protected int value;

    Id(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Id{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
