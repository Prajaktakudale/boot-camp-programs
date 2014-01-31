package volumeAssignment;


public class Volume {

    private double value;
    private VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        if(value < 0)
            throw new IllegalArgumentException("Volume Can not be negative.");
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public VolumeUnit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Volume otherVolume = (Volume) o;
        Volume currentVolumeInML = this.convertTo(new Mililiter());
        Volume otherVolumeInML = otherVolume.convertTo(new Mililiter());
        return Double.compare(currentVolumeInML.value, otherVolumeInML.value) == 0;
    }

    public Volume convertTo(VolumeUnit otherUnit) {
        double newValue = this.unit.getDefault() / otherUnit.getDefault() * this.value;
        return new Volume(newValue, otherUnit);
    }
}
