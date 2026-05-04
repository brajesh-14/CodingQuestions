package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;

public class NumberGreaterThan {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 54, 32, -1, 65, 12, 0, 0, 32,1);

        List<Integer> list1 = list.stream().filter(f -> f > 30).toList();

        System.out.println(list1);
    }
}
