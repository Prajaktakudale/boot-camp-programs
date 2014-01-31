package basic1;

public class Kilometer extends Unit {
    private double defaultValue = 1000 * 1000;

    public Kilometer() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
