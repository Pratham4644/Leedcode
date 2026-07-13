
public class Qfirst {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
            
        }
        System.out.println(k);
    }
    
}
