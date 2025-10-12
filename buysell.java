public class buysell {
    public static int maxprofits(int[] arr) {
        int minim = Integer.MAX_VALUE;
        int maxpofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minim) {
                minim = arr[i];

            } else if (arr[i] - minim > maxpofit) {
                maxpofit = arr[i] - minim;
            }
        }
        return maxpofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        int maxPro = maxprofits(arr);
        System.out.println("Max profit is: " + maxPro);

    }
}
