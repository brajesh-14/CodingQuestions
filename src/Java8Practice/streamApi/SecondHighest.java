package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 54, 32, -1, 65, 12, 0, 0, 32,1);

        Integer sHigh = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(sHigh);


    }
}
