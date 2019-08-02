package ex8_11;

public class TrafficLight_Run {
    public static void main(String[] args) {
        for (TrafficLight trafficLight : TrafficLight.values())
            System.out.printf("%s, %d.%n", trafficLight, trafficLight.getValue());
    }
}