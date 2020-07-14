import java.util.Comparator;
import java.util.PriorityQueue;
/*
    exercise 20.21
 */

public class ChangingPriorityQueueOrder {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }
    }
}
