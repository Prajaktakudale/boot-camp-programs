package volumeAssignment;

public class KiloLiter extends VolumeUnit{
    private double defaultValue = 1000 * 1000;
    public KiloLiter() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
