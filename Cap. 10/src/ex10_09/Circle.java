package ex10_09;

public class Circle extends TwoDimensional_Shape {
    private double x; //diameter

    public Circle(double diameter) {
        setX(diameter);
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
        return Math.PI * Math.pow(x / 2, 2);
    }
}
