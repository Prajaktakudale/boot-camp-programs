package basic1.assignments;

public enum  VolumeUnit implements Unit {
    Milliliter(1), Liter(1000), Kiloliter(1000000), Gallon(3785);

    private double unitValue;
    VolumeUnit(double unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public double getDefault() {
        return unitValue;
    }
}