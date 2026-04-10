public class DigitSum {

    public static void main(String[] args) {

        int x = 12345;
        int rev =0;
        int sum =0;


        while(x>0){

            int rem = x%10;

            sum+= rem;

            x = x/10;
        }

        System.out.println("The sum of the digit is :"+ sum);
    }
}
