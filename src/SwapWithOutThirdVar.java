public class SwapWithOutThirdVar {

    public static void main(String[] args) {

        int a = 10;
        int b = 12;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swaping A is "+a+" And B is "+b);
    }
}
