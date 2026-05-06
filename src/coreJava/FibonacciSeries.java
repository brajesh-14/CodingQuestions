package coreJava;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =0;
        int b = 1;

        System.out.println("Enter till you want to generate the fibonacci...");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
