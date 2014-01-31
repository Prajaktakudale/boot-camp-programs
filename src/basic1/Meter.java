package basic1;

public class Meter extends Unit {
    private double defaultValue = 1000;
    public Meter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
