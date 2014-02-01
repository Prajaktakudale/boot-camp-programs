package basic1.assignments;

public class Feet extends LengthUnit {
    private double defaultValue = 305;
    public Feet() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
