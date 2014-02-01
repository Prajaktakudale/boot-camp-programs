package basic1.assignments;

public class Yard extends LengthUnit {
    private double defaultValue = 915;
    public Yard() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
