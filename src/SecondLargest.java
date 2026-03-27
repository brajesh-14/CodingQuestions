import java.sql.SQLOutput;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {12,54,32,453,453,34,54,32};

        int max = Integer.MIN_VALUE;

        int smax= 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){

                max = arr[i];
            }

            if(arr[i]>smax && arr[i]<max){

                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
