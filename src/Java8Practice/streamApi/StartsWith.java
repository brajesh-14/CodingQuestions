package Java8Practice.streamApi;

import java.util.Arrays;
import java.util.List;

public class StartsWith {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ajay", "Vijay", "Sanjay", "Ankit", "Abhishek", "Naman");

        List<String> startsWith = list.stream().filter(f -> f.startsWith("A")).toList();
        List<String> endsWith = list.stream().filter(f -> f.endsWith("y")).toList();

        System.out.println(startsWith);
        System.out.println(endsWith);
    }
}
