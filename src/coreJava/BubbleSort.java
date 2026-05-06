package coreJava;

import java.util.Arrays;

public class BubbleSort {

    // Bubble Sort is a simple sorting algorithm where:
    // Adjacent elements are compared and swapped if they are in the wrong order
    public static void main(String[] args) {

        int[] arr = {12,43,86,23,4,01,65};

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
