package arraytask;

import java.util.Scanner;

public class DataIO {
    private Scanner scanner = new Scanner(System.in);

    public int[] readArray(int size) {
        int[] arr = new int[size];
        System.out.println("Enter the elements for array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public int readNumber(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public void display(String message) {
        System.out.println(message);
    }

    public void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
