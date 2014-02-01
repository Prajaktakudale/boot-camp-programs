package basic1.assignments;

public class Mile extends LengthUnit {
    private double defaultValue = 1609344;
    public Mile() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
