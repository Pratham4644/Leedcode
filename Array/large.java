package Array;

public class large {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,95};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
            {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
        


