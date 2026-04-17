import java.util.HashMap;
import java.util.Map;

public class FreqOfCharacter {

    public static void main(String[] args) {
        String str = "Find the frequency of each character";
        String s = str.replace(" ", "");

        Map<Character, Integer> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);

        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){

            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
