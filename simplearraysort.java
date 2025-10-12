public class simplearraysort {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 8, 10, 12, 14 };
        if (isSorted(arr)) {
            System.out.println("Array is sorted");

        } else {
            System.out.println("Array is not sorted");
        }
        // This will print true if the array is sorted
    }
}