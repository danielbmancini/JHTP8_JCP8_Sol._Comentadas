package ex8_11;

public class ex8_11_TrafficLight_Run {
    public static void main(String[] args) {
        for (ex8_11_TrafficLight trafficLight : ex8_11_TrafficLight.values())
            System.out.printf("%s, %d.%n", trafficLight, trafficLight.getValue());
    }
}