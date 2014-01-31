package basic1;

public class Mile extends Unit {
    private double defaultValue = 1609344;
    public Mile() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
