import ex8_11.TrafficLight;

/*
    Exercise 8.11 main class
 */
public class TrafficLight_Run {
    public static void main(String[] args) {
        for (TrafficLight trafficLight : TrafficLight.values())
            System.out.printf("%s, %d.%n", trafficLight, trafficLight.getValue());
    }
}