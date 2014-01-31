package basic1;

public class Length {

    private double value;
    private Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Length otherLength = (Length) o;
        Length currentLengthInCM = this.convertTo(new Centimeter());
        Length otherLengthInCM = otherLength.convertTo(new Centimeter());
        return Double.compare(currentLengthInCM.value, otherLengthInCM.value) == 0;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public Length convertTo(Unit otherUnit) {
        double newValue = this.unit.getDefault() / otherUnit.getDefault() * this.value;
        return new Length(newValue, otherUnit);
    }
}

