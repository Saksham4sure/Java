package CollectionFramework;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueee {
    public static void main(String[] args) {
        Queue<Integer> drivingTestLine = new PriorityQueue<>();

        drivingTestLine.add(4);
        drivingTestLine.add(2);
        drivingTestLine.add(5);
        drivingTestLine.add(3);

        System.out.println(drivingTestLine);

        drivingTestLine.remove(4);

        System.out.println(drivingTestLine);
    }
}
