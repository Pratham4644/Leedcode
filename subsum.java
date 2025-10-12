public class subsum {
    public static long maxsum(int[] arr, int k) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;

            }

        }
        if (sum < 0) {
            sum = 0;
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int k = arr.length;
        long sum1 = maxsum(arr, k);
        System.out.println(sum1);
    }

}
