package volumeAssignment;

import basic1.Unit;

public class Quantity {
    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        if(value < 0)
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

        Quantity quantity= (Quantity) o;
        Quantity currentQuantity = this.convertTo(this.unit);
        Quantity otherQuantity = quantity.convertTo(this.unit);
        return Double.compare(currentQuantity.value, otherQuantity.value) == 0;
    }

    public Quantity convertTo(Unit otherUnit) {
        double newValue = this.unit.getDefault() / otherUnit.getDefault() * this.value;
        return new Quantity(newValue, otherUnit);
    }

}


