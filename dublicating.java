public class dublicating {
    public static int Sorted(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        int newLength = Sorted(arr);
        System.out.println("New length of the array after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
    }
}