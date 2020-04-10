package ex10_09;

public class Triangle extends TwoDimensional_Shape {
    private double x; //base/side length

    public Triangle(double baseLength) {
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
        return Math.pow(x, 2) * Math.sqrt(3) / 4;
    }
}
