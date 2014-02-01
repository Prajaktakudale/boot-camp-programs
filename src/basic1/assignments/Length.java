package basic1.assignments;

public class Length extends Quantity {

    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    public Length convertTo(LengthUnit otherUnit) {
        Quantity quantity = convertToGivenUnit(otherUnit);
        return new Length(quantity.getValue(), otherUnit);
    }
}

