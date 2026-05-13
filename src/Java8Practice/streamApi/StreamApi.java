package Java8Practice.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        List<String> sortLengthWise = example20.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("20. Sort the list according to length: "+sortLengthWise);
        System.out.println();


        List<String> example21 = Arrays.asList("Shamim", "Shubham", "Sahil", "Brajesh", "Pragati");
        List<String> reverseList = example21.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("21. Reverse the List alphabatically"+reverseList);
        System.out.println();


        List<List<Integer>> example22 = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9));
        List<Integer> flattenList = example22.stream().flatMap(f -> f.stream()).toList();
        System.out.println("22. Flattening the list:"+flattenList);
        System.out.println();


        List<Integer> example23 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> separateEvenOdd = example23.stream().collect(Collectors.partitioningBy(p -> p % 2 == 0));
        System.out.println("23. Separate Even and Odd: "+separateEvenOdd);
        System.out.println();


        List<Integer> example24 = Arrays.asList(10, 20, 50, 30, 40, 50);
        Integer secondHighest = example24.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("24. Second Highest element is : "+secondHighest);
        System.out.println();


        List<Integer> example25 = Arrays.asList(12, 43, 65, 3, 45, 23, 65, 27, 43);
        List<Integer> greaterThan = example25.stream().filter(f -> f > 20).toList();
        System.out.println("25. Greater than the elements are: "+greaterThan);
        System.out.println();


        List<Integer> example26 = Arrays.asList(1, 2, 3, 4, 5);
        double average = example26.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("26. Average of the give numbers are: "+average);
        System.out.println();


        String example27 = "Java is fun and Java is powerful";
        LinkedHashMap<String, Long> freq = Arrays.stream(example27.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("27. Frequency of each words: "+freq);
        System.out.println();


        List<Integer> example28 = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).map(f -> f[0])
                .limit(10).toList();
        System.out.println("28. Fibonacci Series: "+example28);
        System.out.println();

        List<String> example29 = Arrays.asList("apple", "banana", "cherry", "date");
        String longestString = example29.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println("30. Longest String in the list is: "+longestString);
        System.out.println();


        List<Integer> example30 = Arrays.asList(1, 2, 3);
        List<Integer> example03 = Arrays.asList(4, 5, 6);
        List<Integer> afterConcat = Stream.concat(example30.stream(), example03.stream()).toList();
        System.out.println("31. Concat two list: "+afterConcat);
        System.out.println();


        List<Integer> example31 = Arrays.asList(5, 8, 12, 3, 20);
        Integer firstElement = example31.stream().filter(f -> f > 10).findFirst().get();
        System.out.println("32. First Element greater than 10 is: "+firstElement);
        System.out.println();

        List<Integer> example32 = Arrays.asList(10, 20, 5, 15);
        Integer minimumEle = example32.stream().min(Integer::min).get();
        System.out.println("33. Smallest element is: "+minimumEle);
        System.out.println();

        List<Integer> example33 = Stream.generate( () -> (int)(Math.random()*10)).limit(5).toList();
        System.out.println("34. Random generated numbers are: "+example33);
        System.out.println();

        int number = 5;
        int fact = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        System.out.println("34. Factorial of the number "+number+" is: "+ fact);
        System.out.println();


    }
}
