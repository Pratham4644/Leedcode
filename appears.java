public class appears {

    public static int appear(int[] arr) {
        int n = arr.length;
        int xorrs = 0;
        for (int i = 0; i < n; i++) {
            xorrs = xorrs ^ arr[i];

        }
        return xorrs;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 3, 4 };
        appear(arr);
        System.err.println(appear(arr));
    }

}