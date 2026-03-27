import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : arr) {

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());

            }

            map.get(key).add(s);
        }
        System.out.println(map.values());

    }
}
