package basic1.assignments;

public class Meter extends LengthUnit {
    private double defaultValue = 1000;
    public Meter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
