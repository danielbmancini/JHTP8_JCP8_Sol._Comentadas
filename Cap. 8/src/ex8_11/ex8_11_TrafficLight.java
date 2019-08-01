package ex8_11;

public enum ex8_11_TrafficLight {
    RED(1),
    GREEN(2),
    YELLOW(3);

    private int value;

    ex8_11_TrafficLight(int light) {
        value = light;
    }

    int getValue() {
        return value;
    }

}