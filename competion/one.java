package competion;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("the array is");
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];

            }
            if (arr[i] < k) {
                k = arr[i];
            }
        }

        int sub = m - k;
        System.out.println(sub);

    }
}