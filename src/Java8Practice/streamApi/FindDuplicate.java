package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 54, 32, 65, 12, 0, 0, 32,1);

        Set<Integer> set = new HashSet<>();

        List<Integer> list1 = list.stream().filter(f -> !set.add(f)).toList();

        System.out.println(list1);

    }
}
