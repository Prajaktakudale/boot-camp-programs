package basic1;

public class Milimeter extends Unit {
    private double defaultValue = 1;
    public Milimeter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
