public class findlargestelement {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 8, 6 };
        int num = arr[0];
        int sec = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num < arr[i] && arr[i] > sec) {
                sec = arr[i];
            }

        }
        // int ind = num - 1;

        System.out.println("The  Second largest element is: " + sec);
    }
}
