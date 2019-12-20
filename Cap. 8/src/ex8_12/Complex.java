package ex8_12;

public class Complex {
    private float a;
    private float b;

    Complex() {
        a = 0f;
        b = 0f;
    }

    public Complex(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private float getA() {
        return a;
    }

    private float getB() {
        return b;
    }

    public Complex sumWith(Complex second) {
        return new Complex((a + second.getA()), (b + second.getB()));
    }

    public Complex subtractWith(Complex second) {
        return new Complex((a - second.getA()), (b - second.getB()));
    }

    public String printThisNumber() {
        return String.format("(%f, %f)", getA(), getB());
    }

}