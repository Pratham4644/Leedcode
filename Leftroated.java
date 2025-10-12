public class Leftroated {
    // Rotates the array to the left by one position
    void leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        Leftroated leftRotated = new Leftroated();
        int[] arr = { 1, 2, 3, 4, 5 };
        leftRotated.leftRotateByOne(arr);
        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}