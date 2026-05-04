package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(21,32,12,43,45,68,92);

        // // if we need to modify the list later then use collect(Collectors.toList());
        List<Integer> list1 = list.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());

        // if we do not want any modification later then use .toList();
        List<Integer> list2 = list.stream().filter(f -> f % 2 != 0).toList();

        System.out.println("Even are: " +list1);
        System.out.println("Odd are: " +list2);
    }
}
