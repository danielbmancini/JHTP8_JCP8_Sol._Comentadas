package ex10_09;

public class Circle extends TwoDimensional_Shape {
    private double x; //diameter

    Circle(double diameter) {
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
    /*@Override
    public String toString()
    {
        return String.format
    }*/
}