package volumeAssignment;

public class Gallons extends VolumeUnit {
    private double defaultValue = 3785;
    public Gallons(){
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
