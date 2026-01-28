package ExceptionalHandeling;

import java.util.Scanner;

public class ArrayErr {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);

        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        arr[3] = scan.nextInt();
        arr[4] = scan.nextInt();

        System.out.println(arr);
    }
}
