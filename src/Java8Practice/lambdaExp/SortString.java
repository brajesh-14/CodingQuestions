package Java8Practice.lambdaExp;

import java.util.Arrays;
import java.util.List;

public class SortString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Shamim","Shubham","Sahil", "Brajesh", "Pragati");

       /* list.sort((a, b) -> a.length() - b.length());

        System.out.println(list);*/

        List<String> list1 = list.stream().sorted((a, b) -> a.length() - b.length()).toList();

        System.out.println(list1);
    }
}
