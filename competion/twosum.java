package competion;

import java.util.Scanner;

public class twosum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("necet part");
        }
        int[] result = new int[arr.length > arr2.length ? arr.length : arr2.length];
        int c = 0;
        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        while (k >= 0) {
            int sum = c;
            if (i >= 0) {
                sum += arr[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            c = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            k--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : result) {
            System.out.println(val);
        }
    }

}
