package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;

public class MaxElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 54, 32, -1, 65, 12, 0, 0, 32,1);


        // find the largest number
        Integer i = list.stream().max(Comparator.naturalOrder()).get();

/*        Integer i2 = list.stream().max((a, b) -> a.compareTo(b)).get();

        System.out.println(i2);*/

        System.out.println(i);

        // find the smallest number
        Integer i1 = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println(i1);
    }
}
