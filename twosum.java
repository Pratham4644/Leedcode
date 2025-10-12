import java.util.Arrays;

public class twosum {
    // Returns true if any two numbers in arr sum to target, else false
    public static boolean sums(int[] arr, int target) {
        Arrays.sort(arr); // Use Arrays.sort, not Array.sort
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        if (sums(arr, target)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}