package ex10_09;

public class Tetrahedron extends ThreeDimensional_Shape { //regular tetrahedron
    private double x; //base/side length of a triangle in a face

    @Override
    public void setZ(double z) {
    }

    Tetrahedron(double baseLength) {
        setX(baseLength);
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(x, 2) / 4;
    }

    @Override
    public double getVolume() {
        return Math.pow(x, 3) / (6 * Math.sqrt(2));
    }
}
