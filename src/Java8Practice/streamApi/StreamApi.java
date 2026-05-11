package Java8Practice.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> example1 = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.print("1.print list using lambda expressions : ");
        example1.forEach(System.out::println);
        System.out.println();

        List<Integer> example2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("2. Print all the even numbers in the list ");
        List<Integer> evenNum = example2.stream().filter(f -> f % 2 == 0).toList();
        System.out.println(evenNum);
        System.out.println();

        List<Integer> example3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("3. Print all the odd numbers in the list ");
        List<Integer> oddNum = example2.stream().filter(f -> f % 2 != 0).toList();
        System.out.println(oddNum);
        System.out.println();

        List<Integer> example4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("4. Print the maximum number from the list ");
        Integer maximum = example4.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(maximum);
        System.out.println();

        List<Integer> example5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("5. Print the minimum number from the list ");
        Integer minimum = example5.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(minimum);
        System.out.println();

        List<String> example6 = Arrays.asList("Ram", "Laxman", "Bharat", "Shatrudhan");
        List<String> toLowerCase = example6.stream().map(m -> m.toLowerCase()).toList();
        System.out.println("6.String to LowerCase "+toLowerCase);
        System.out.println();

        List<String> example7 = Arrays.asList("Ram", "Laxman", "Bharat", "Shatrudhan");
        List<String> toUpperCase = example7.stream().map(m -> m.toUpperCase()).toList();
        System.out.println("7.String to UpperCase "+toUpperCase);
        System.out.println();

        List<String> example8 = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Integer, List<String>> byLength = example8.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("8. Sort String by length :"+byLength);
        System.out.println();

        List<Integer> example9 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sumOfAll = example9.stream().reduce(Integer::sum).get();
        System.out.println("9. Sum of all integers in the list is :"+sumOfAll);
        System.out.println();

        List<String> example10 = Arrays.asList("Alice", "Bob", "Charlie");
        String joinString = example10.stream().collect(Collectors.joining(" "));
        System.out.println("10. Join String in a list: "+joinString);
        System.out.println();

        List<String> example11 = Arrays.asList("apple", "banana", "apple", "grapes", "Papaya", "banana", "grapes");
        LinkedHashMap<String, Long> freqOfWords = example11.stream().collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println("11. Frequency of each words: "+ freqOfWords);
        System.out.println();

        String example12 = "Welcome to Neosoft";
//        LinkedHashMap<Character, Long> freqOfChars = example12.chars().mapToObj(m -> (char) m).filter(f -> f != ' ').collect(Collectors.groupingBy(g -> g, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(freqOfChars);
        LinkedHashMap<String, Long> freqOfChars = Arrays.stream(example12.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("12. Frequency of each characters: "+freqOfChars);
        System.out.println();

        String example13 = "swiss Bank";
        String firstNonRepeating = Arrays.stream(example13.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(f -> f.getValue() == 1).findFirst().get().getKey();
        System.out.println("13. First non repeating Character is: "+firstNonRepeating);
        System.out.println();


        List<Integer> example14 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removeDup = example14.stream().distinct().toList();
        System.out.println("14. After removing duplicate elements: "+removeDup);
        System.out.println();

        List<Integer> example15 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> dupElements = example15.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println("15. Duplicate Elements are: "+dupElements);
        System.out.println();


        String example16 = "programming";
        List<Character> dupCharacter = example16.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println("16. Duplicate Characters are: "+ dupCharacter);
        System.out.println();


        List<String> example17 = Arrays.asList("Alice", "Bob", "Annie", "Alex");
        List<String> startsWith = example17.stream().filter(f -> f.startsWith("A")).toList();
        System.out.println("17. Starts with: "+startsWith);
        System.out.println();


        List<String> example18 = Arrays.asList("Alice", "Bob", "Annie", "Maggie", "Charles");
        List<String> endWith = example18.stream().filter(f -> f.endsWith("e")).toList();
        System.out.println("18. End with: "+endWith);
        System.out.println();

        List<String> example19 = Arrays.asList("Shamim", "Shubham", "Sahil", "Brajesh", "Pragati");
        List<String> sortList = example19.stream().sorted().toList();
        System.out.println("19. Sort the list alphabatically: "+sortList);
        System.out.println();


        List<String> example20 = Arrays.asList("Shamim", "Shubham", "Sahil", "Brajesh", "Pragati");
        List<String> sortLenthWise = example20.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("20. Sort the list according to length: "+sortLenthWise);
        System.out.println();


        List<String> example21 = Arrays.asList("Shamim", "Shubham", "Sahil", "Brajesh", "Pragati");
        List<String> reverseList = example21.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("21. Reverse the List alphabatically"+reverseList);
        System.out.println();



    }
}
