package basic1.assignments;


public class Volume extends Quantity {

    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume convertTo(VolumeUnit otherUnit) {
        Quantity quantity = convertToGivenUnit(otherUnit);
        return new Volume(quantity.getValue(), otherUnit);
    }
}
