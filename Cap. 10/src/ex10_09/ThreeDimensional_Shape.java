package ex10_09;

public abstract class ThreeDimensional_Shape implements Shape {
    @Override
    public String toString() {
        return String.format("Area = %f%nVolume = %f%n%n", getArea(), getVolume());
    }
}
