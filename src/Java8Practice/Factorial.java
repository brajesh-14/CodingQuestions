package Java8Practice;

interface Fact{

    int fact(int x);
}
public class Factorial {

    public static void main(String[] args) {

        Fact f = (x) -> {

            int result = 1;

            for(int i=1; i<=x; i++){

                result = result * i;

            }
            return  result;
        };

        System.out.println(f.fact(5));
    }
}
