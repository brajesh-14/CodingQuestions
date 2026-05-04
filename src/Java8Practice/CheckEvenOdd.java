package Java8Practice;

import java.util.Arrays;
import java.util.List;

interface Check{
    boolean check(int a);
}
public class CheckEvenOdd {

    public static void main(String[] args) {

        Check c = (a) -> {
            return a % 2 == 0;
        };

        System.out.println("Is the number is even :"+ c.check(43));

        // check using stream api

        List<Integer> list = Arrays.asList(1,2,34,5,6,7,4,32,54);

        List<Integer> list1 = list.stream().filter(f -> f % 2 == 0).toList();

        System.out.println(list1);
    }
}
