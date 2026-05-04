package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;

public class CountElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 32, 54, 32, -1, 65, 12, 0, 0, 32,1);

        Long collect = list.stream().count();

        System.out.println(collect);
    }
}
