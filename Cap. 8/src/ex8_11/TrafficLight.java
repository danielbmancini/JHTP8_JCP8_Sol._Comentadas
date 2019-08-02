package ex8_11;

public enum TrafficLight {
    RED(1),
    GREEN(2),
    YELLOW(3);

    private int value;

    TrafficLight(int light) {
        value = light;
    }

    int getValue() {
        return value;
    }

}