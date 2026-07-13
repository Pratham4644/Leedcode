package Array;

public class sumsum{
    public static void main(String[] args) {
        int[] arr={2,3,5,4,5,10};
        int target=10;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("index of i: "+i+" :index of j: "+j);
                    break;
                }
             
            }
        }
    }
}