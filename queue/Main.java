package queue;

public class Main {
    public static void main(String[] args) {
        LinearQueue queue1 = new LinearQueue();

        queue1.dequeue();
        queue1.enqueue(1);
        queue1.enqueue(1);
        queue1.enqueue(1);
        queue1.enqueue(1);
        queue1.enqueue(1);
        queue1.printQueue();
    }
}
