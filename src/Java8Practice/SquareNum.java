package Java8Practice;

interface Square{
    int sqr(int s);
}
public class SquareNum {

    public static void main(String[] args) {

        Square sq = (s) -> {
            return s*s;
        };

        System.out.println(sq.sqr(6));
    }
}
