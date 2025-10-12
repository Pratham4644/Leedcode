import java.util.Scanner;

public class baseArray {
    public static void swap(int[] arr, int i, int j) {
        int tep = arr[i];
        arr[i] = arr[j];
        arr[j] = tep;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        swap(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}