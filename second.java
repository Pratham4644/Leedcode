

public class second {
    public static void main(String[] args) {
        int[] arr= { 6,5,8,88,99,77,11};
       // Arrays.sort(arr);
       int n=arr.length;
       int secondLargest=arr[n-2];
       int largest=arr[n-1];
       System.out.println("Second Largest Element: " + secondLargest);
       System.out.println("Largest Element: " + largest);
       System.out.println(secondLargest);
       System.out.println(largest);
    }
}