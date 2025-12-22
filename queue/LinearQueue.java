package queue;

public class LinearQueue {
    public int arr[] = new int[5];
    public int front = -1;
    public int rear = -1;
    public int max = arr.length;

    public void enqueue(int input) {
        if (rear == max - 1) {
            System.out.println("Queue overflow !!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = input;
        }
    }

    public void dequeue() {
        if (rear == -1) {
            System.out.println("No one is in queue!!");
        } else {
            front++;
        }
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}
