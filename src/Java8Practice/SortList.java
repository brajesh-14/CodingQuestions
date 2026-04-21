package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,8,2,7,0,32,32);

        list.sort((a,b) -> a - b);

        System.out.println(list);
    }
}
