package Array;
import java.util.Arrays;

public class arraypartition {
    public int arrayparsing(int[] arr){
        Arrays.sort(arr);
        int sum = 0;

        for(int i = 0; i < arr.length; i += 2){
            if(i + 1 < arr.length){
                sum += arr[i + 1];
            }
        }

        return sum;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        arraypartition obj = new arraypartition();

        System.out.println(obj.arrayparsing(arr));
    }
}
