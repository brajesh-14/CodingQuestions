package coreJava;

public class StarPattern {

    public static void main(String[] args) {

        System.out.println("1. Print Square of Stars (n x n Stars): ");

        for(int i=0; i<5; i++){
            for(int j=0; j<5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("2. Print an Increasing Triangle of Stars: ");

        for(int i=0; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("3. Print an Decreasing Triangle of Stars: ");

        for(int i=0; i<5; i++){
            for(int j=i; j<5; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("4. Print a Right-Aligned Triangle of Stars: ");

        int n =5;

        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("5. Print a Reversed Right-Aligned Triangle of Stars: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("6. Print Stars in Even Numbers (2, 4, 6, 8, 10): ");
        int x =10;

        for(int i=1; i<=x; i++) {

            if(i%2==0){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        System.out.println("7.Print Stars in Odd Numbers (1, 3, 5, 7, 9): ");

        for(int i=1; i<=x; i++) {

            if(i%2 !=0){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        System.out.println("8.Print Centered Pyramid: ");
        for(int i=1; i<=x-5; i++) {
            for(int j = 1; j<x-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<i; j++){
                System.out.print("*");
            }
            for(int j = 1; j< i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
