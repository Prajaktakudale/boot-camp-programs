package basic1;

public class Yard extends Unit {
    private double defaultValue = 915;
    public Yard() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
