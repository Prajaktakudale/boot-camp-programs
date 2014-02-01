package basic1.assignments;

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
