package ex8_04;

public class Rectangle {
    private double length;
    private double width;

    private void setLength(double length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
    }

    private void setWidth(double width) {
        if(width > 0.0 && width < 20.0)
        this.width = width;
    }
    private double getLength()
    {
        return length;
    }
    private double getWidth()
    {
        return width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
        System.out.println(getLength());
        System.out.println(getWidth());
    }

}
