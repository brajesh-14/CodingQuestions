package coreJava;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {12,65,965,2345,245,344,1};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0; i< arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Largest Element present in the array is "+ max+ " and the Smallest Emement is: "+min);
    }
}
