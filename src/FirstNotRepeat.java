import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeat {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            map.put(a, map.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            if(entry.getValue()==1){

                System.out.println(entry.getKey());
            }
        }

    }
}
