
public class meragearray {

    public static int missing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        return sum - sum1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 }; // Example array with a missing number
        int n = 10; // The maximum number in the array

        int missingNumber = missing(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}