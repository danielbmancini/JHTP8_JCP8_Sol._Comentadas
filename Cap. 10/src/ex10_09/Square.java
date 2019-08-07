package ex10_09;

public class Square extends TwoDimensional_Shape {
    private double x;

    Square(double x) {
        setX(x);
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
        return Math.pow(x, 2);
    }
}
