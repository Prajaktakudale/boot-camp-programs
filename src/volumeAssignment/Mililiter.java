package volumeAssignment;

public class Mililiter extends VolumeUnit {
    private double defaultValue = 1;

    public Mililiter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
