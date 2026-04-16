public class ReverseDigit {

    public static void main(String[] args) {
        int x = 123;

        int reverse;
        for(reverse = 0; x != 0; x /= 10) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
        }

        System.out.println(reverse);
    }
}
