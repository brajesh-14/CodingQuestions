public class DigitSum {

    public static void main(String[] args) {
        int x = 12345;
        int rev = 0;

        int sum;
        for(sum = 0; x > 0; x /= 10) {
            int rem = x % 10;
            sum += rem;
        }

        System.out.println("The sum of the digit is :" + sum);
    }
}
