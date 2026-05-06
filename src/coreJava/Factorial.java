package coreJava;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fact =1;

        System.out.println("Enter the number for which factorial is needed: ");
        int num = sc.nextInt();

        for(int i = 1 ; i<= num; i++){
            fact = fact*i;
        }

        System.out.println(fact);
    }
}
