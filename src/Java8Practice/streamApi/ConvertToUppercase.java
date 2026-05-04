package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "Shyam", "Mohan","Shashi");

        List<String> list1 = list.stream().map(m -> m.toUpperCase()).toList();

        System.out.println(list1);
    }
}
