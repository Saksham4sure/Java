package stack;

public class Stack {
    public int arr[] = new int[10];
    public int top = -1;
    public int max = arr.length;

    public void push(int input) {
        if (top == max - 1) {
            System.out.println("Array overflow Remove something!!");
        } else {
            top++;
            arr[top] = input;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Nothing to remove Add something!!");
        } else {
            top--;
        }
    }

    public void printTop() {
        if (top == -1) {
            System.out.println("Stack empty!!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}