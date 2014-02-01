package basic1.assignments;

public class Milliliter extends VolumeUnit {
    private double defaultValue = 1;

    public Milliliter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
