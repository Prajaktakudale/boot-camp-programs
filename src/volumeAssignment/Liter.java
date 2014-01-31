package volumeAssignment;

public class Liter extends VolumeUnit{
    private double defaultValue = 1000;
    public Liter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
