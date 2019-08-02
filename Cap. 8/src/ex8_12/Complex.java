package ex8_12;

class Complex {
    private float a;
    private float b;

    Complex() {
        a = 0f;
        b = 0f;
    }

    Complex(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private float getA() {
        return a;
    }

    private float getB() {
        return b;
    }

    Complex sumWith(Complex second) {
        return new Complex((a + second.getA()), (b + second.getB()));
    }

    Complex subtractWith(Complex second) {
        return new Complex((a - second.getA()), (b - second.getB()));
    }

    String printThisNumber() {
        return String.format("(%f, %f)", getA(), getB());
    }

}