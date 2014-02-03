package basic1.assignments;

public enum LengthUnit implements Unit {
    Centimeter(10), Millimeter(1), Meter(1000), Kilometer(1000 * 1000), Inch(25.4), Feet(305), Yard(915), Mile(1609344);

    private final double unitValue;

    LengthUnit(double unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public double getDefault() {
        return unitValue;
    }
}
