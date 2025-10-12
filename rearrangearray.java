public class rearrangearray {
    public static int[] rearrng(int[] arr) {
        int n = arr.length;
        int[] arrs = new int[n];
        int poss = 0, neg = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arrs[poss] = arr[i];
                poss += 2;
            } else {
                arrs[neg] = arr[i];
                neg += 2;
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, -9, -4, -8 };
        int[] result = rearrng(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}