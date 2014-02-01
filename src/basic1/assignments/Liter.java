package basic1.assignments;

public class Liter extends VolumeUnit{
    private double defaultValue = 1000;
    public Liter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
