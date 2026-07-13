// removed package declaration to match file location
package Array;
public class back{
    public static void main(String[] args){
        int[] arr = {2,3,5,1,4,5,10};
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("index of i: " + i);
                break;
            } else {
                target = target + 1;
                System.out.println(arr[i]);
            }
        }
    }
}