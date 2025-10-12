import java.util.Scanner;
import java.util.Arrays;

public class FindElelemt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to find in the array:");
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter the value to find in the array:");

        int findingvalue = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findingvalue) {
                idx = i;
                break;

            }
        }
        System.out.println(idx);

    }
}
