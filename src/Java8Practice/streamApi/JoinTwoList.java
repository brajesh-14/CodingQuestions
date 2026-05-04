package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = Arrays.asList(6,7,8,9);

       /* List<List<Integer>>  list = Arrays.asList(list1, list2);

        List<Integer> list3 = list.stream().flatMap(f -> f.stream()).toList();

        System.out.println(list3);*/

        List<Integer> list = Stream.of(list1,list2).flatMap(f -> f.stream()).toList();

        System.out.println(list);
    }
}
