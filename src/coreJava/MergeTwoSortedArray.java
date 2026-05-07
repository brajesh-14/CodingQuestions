package coreJava;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};

        int[] arr = new int[arr1.length + arr2.length];

        int i=0, j=0;

        for(int k=0; k< arr.length; k++){

            if(i>=arr1.length){
                arr[k]=arr2[j++];
            } else if (j >= arr2.length) {
                arr[k]= arr1[i++];
            } else if (arr1[i]<= arr2[j]) {
                arr[k] = arr1[i++];
            }else {
                arr[k] = arr2[j++];
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
