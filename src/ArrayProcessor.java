import java.util.Arrays;

public class ArrayProcessor {
    private final int[] values;

    public ArrayProcessor(int[] values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    public int sum() {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public double average() {
        if (values.length == 0) {
            return 0;
        }
        return (double) sum() / values.length;
    }

    public int max() {
        if (values.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int currentMax = values[0];
        for (int value : values) {
            if (value > currentMax) {
                currentMax = value;
            }
        }
        return currentMax;
    }
}
