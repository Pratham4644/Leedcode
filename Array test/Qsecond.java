public class Qsecond{
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
            
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
