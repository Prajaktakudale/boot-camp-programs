package basic1;

public class Inch extends Unit {
    private double defaultValue = 25.4;
    public Inch() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
