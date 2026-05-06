package coreJava;

import java.sql.SQLOutput;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,21,22};

        int countEven=0, countOdd=0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]% 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("Total Even count is "+countEven+ " and total odd count is "+countOdd);
    }
}
