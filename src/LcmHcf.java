public class LcmHcf {

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        int len = Math.min(a, b);

        for(int i = len; i > 0; --i) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("HCF is :" + i);
                int lcm = a * b / i;
                System.out.println("LCM is :" + lcm);
                break;
            }
        }

    }
}
