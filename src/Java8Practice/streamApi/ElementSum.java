package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ElementSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        Integer i = list.stream().reduce((a, b) -> a + b).get();

        System.out.println(i);
    }
}
