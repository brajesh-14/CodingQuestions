import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int arr[] = {0,12,3,0,3,0,14,53,0,0,0,43,6,98,234};

        int arr2[] = new int[arr.length];

        int idx=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr2[idx]=arr[i];
                idx++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr2[idx]=arr[i];
                idx++;
            }
        }
        System.out.print(Arrays.toString(arr2));
     }
}
