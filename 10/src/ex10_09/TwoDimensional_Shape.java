package ex10_09;

public abstract class TwoDimensional_Shape implements Shape {
    @Override
    public double getVolume() {
        return 0.0;
    }

    @Override
    public void setZ(double z) {
    }

    @Override
    public String toString() {
        return String.format("Area = %f%n%n", getArea());
    }
}
