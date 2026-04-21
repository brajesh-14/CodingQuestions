package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class SortString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Shamim","Shubham","Sahil", "Pragati");

        list.sort((a, b) -> a.length() - b.length());

        System.out.println(list);

    }
}
