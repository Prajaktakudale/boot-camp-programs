package basic1;

/**
 * Created by prajaktv on 1/31/14.
 */
public class Feet extends Unit {
    private double defaultValue = 305;
    public Feet() {
    }

    @Override
    public double getDefault() {
        return defaultValue;
    }
}
