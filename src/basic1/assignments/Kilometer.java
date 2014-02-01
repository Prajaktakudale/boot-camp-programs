package basic1.assignments;

public class Kilometer extends LengthUnit {
    private double defaultValue = 1000 * 1000;

    public Kilometer() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
