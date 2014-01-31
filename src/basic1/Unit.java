package basic1;

public abstract class Unit {
    @Override
    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            return true;
        }
        return false;
    }
    abstract public double getDefault();
}
