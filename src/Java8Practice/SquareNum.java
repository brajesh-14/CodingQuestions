package Java8Practice;

import java.util.Arrays;
import java.util.List;

interface Square{
    int sqr(int s);
}
public class SquareNum {

    public static void main(String[] args) {

        Square sq = (s) -> {
            return s*s;
        };

        System.out.println(sq.sqr(6));

        List<Integer> list = Arrays.asList(12,32,43,54,32,54);

        List<Integer> list1 = list.stream().map(m -> m * m).toList();

        System.out.println(list1);
    }
}
