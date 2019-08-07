package ex10_09;

public class Cube extends ThreeDimensional_Shape {
    private double x;

    @Override
    public void setY(double y) {
    }

    @Override
    public void setZ(double z) {
    }

    Cube(double x) {
        setX(x);
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return 4 * Math.pow(x, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(x, 3);
    }
}
