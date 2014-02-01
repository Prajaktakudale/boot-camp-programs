package basic1.assignments;

public class Inch extends LengthUnit {
    private double defaultValue = 25.4;
    public Inch() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
