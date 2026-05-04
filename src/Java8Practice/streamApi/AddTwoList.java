package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;

public class AddTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = Arrays.asList(6,7,8,9,10);

        List<List<Integer>> list = Arrays.asList(list1, list2);

        List<Integer> list3 = list.stream().flatMap(List::stream).toList();


        // this is same as above
       // List<Integer> list4 = list.stream().flatMap(f -> f.stream()).toList();

        System.out.println(list3);
    }

}
