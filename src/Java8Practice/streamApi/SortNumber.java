package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 5, 23, 0, 65, 42);

        List<Integer> list1 = list.stream().sorted().toList();

        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();


        System.out.println("After sorting in ascending order "+list1);

        System.out.println("After sorting in descending order "+ list2);
    }
}
