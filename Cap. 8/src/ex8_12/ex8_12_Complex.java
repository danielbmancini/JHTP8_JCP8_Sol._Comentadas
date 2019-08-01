package ex8_12;

class ex8_12_Complex {
    private float a;
    private float b;

    ex8_12_Complex() {
        a = 0f;
        b = 0f;
    }

    ex8_12_Complex(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private float getA() {
        return a;
    }

    private float getB() {
        return b;
    }

    ex8_12_Complex sumWith(ex8_12_Complex second) {
        return new ex8_12_Complex((a + second.getA()), (b + second.getB()));
    }

    ex8_12_Complex subtractWith(ex8_12_Complex second) {
        return new ex8_12_Complex((a - second.getA()), (b - second.getB()));
    }

    String printThisNumber() {
        return String.format("(%f, %f)", getA(), getB());
    }

}