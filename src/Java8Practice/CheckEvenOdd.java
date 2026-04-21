package Java8Practice;

interface Check{
    boolean check(int a);
}
public class CheckEvenOdd {

    public static void main(String[] args) {

        Check c = (a) -> {
            return a % 2 == 0;
        };

        System.out.println("Is the number is even :"+ c.check(43));
    }
}
