package coreJava;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 12, 3, 0, 3, 0, 14, 53, 0, 0, 0, 43, 6, 98, 234};

        int idx =0;

        for(int i=0; i<arr.length;i++){

            if(arr[i] != 0){
                int temp = arr[idx];
                arr[idx++] = arr[i];
                arr[i]= temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

/*    public static void main(String[] args) {
        int[] arr = new int[]{0, 12, 3, 0, 3, 0, 14, 53, 0, 0, 0, 43, 6, 98, 234};
        int[] arr2 = new int[arr.length];
        int idx = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > 0) {
                arr2[idx] = arr[i];
                ++idx;
            }
        }

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                arr2[idx] = arr[i];
                ++idx;
            }
        }

        System.out.print(Arrays.toString(arr2));
    }*/


   /* public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        int ind =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]!=0){
                arr[ind++] = arr[i];
            }
        }
        while(ind<arr.length){
            arr[ind]= 0;
            ind++;
        }
        System.out.println(Arrays.toString(arr));

    }*/
}
