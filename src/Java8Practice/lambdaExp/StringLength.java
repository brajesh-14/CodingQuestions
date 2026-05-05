package Java8Practice.lambdaExp;


interface Length{
    int len(String s);
}
public class StringLength {

    public static void main(String[] args) {

        Length l = (s) -> {
            return s.length();
        };

        System.out.println(l.len("Hello world"));
    }
}
