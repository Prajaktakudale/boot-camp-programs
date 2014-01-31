package volumeAssignment;

public abstract class VolumeUnit {
    @Override
    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            return true;
        }
        return false;
    }
    abstract public double getDefault();
}
