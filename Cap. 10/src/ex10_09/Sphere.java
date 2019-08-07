package ex10_09;

public class Sphere extends ThreeDimensional_Shape {
    private double x; //diameter = y = z

    @Override
    public void setY(double y) {
    }

    @Override
    public void setZ(double z) {
    }

    Sphere(double diameter) {
        setX(diameter);
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(x / 2, 2);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(x / 2, 3);
    }

}
