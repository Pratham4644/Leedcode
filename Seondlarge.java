public class Seondlarge {

    public static int thirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements.");
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        return third;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 5, 25, 15 };
        System.out.println("Third largest number is: " + thirdLargest(arr));
    }
}
