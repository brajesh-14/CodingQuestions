package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DictionarySorting {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Shamim",
                "Shubham",
                "Sahil",
                "Brajesh",
                "Pragati"
        );


        List<String> list1 = list.stream().sorted().toList();

        System.out.println(list1);
    }
}
