package basic1.assignments;

public class Quantity {
    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        if (value < 0)
            throw new IllegalArgumentException("Volume Can not be negative.");
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Quantity quantity = (Quantity) o;
        Quantity currentQuantity = this.convertToGivenUnit(this.unit);
        Quantity otherQuantity = quantity.convertToGivenUnit(this.unit);
        return Double.compare(currentQuantity.value, otherQuantity.value) == 0;
    }

    protected Quantity convertToGivenUnit(Unit otherUnit) {
        double newValue = this.getUnit().getDefault() / otherUnit.getDefault() * this.getValue();
        return new Quantity(newValue, otherUnit);
    }

}


