package basic1.assignments;

public class Millimeter extends LengthUnit {
    private double defaultValue = 1;
    public Millimeter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
