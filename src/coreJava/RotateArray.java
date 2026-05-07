package coreJava;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {8,43,23,86,23,91};

        int k = 2;

        // for right rotation
        int[] right = new int[arr.length];

        for(int i=0; i< arr.length; i++){

            right[(i+k)% arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(right));

        // for left rotation
        int[] left = new int[arr.length];

        for(int i=0; i< arr.length; i++){

            left[(i-k+ arr.length)% arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(left));
    }
}
