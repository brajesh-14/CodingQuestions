import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Namaskaram";

        char[] ch = str.toCharArray();

        int left = 0, right = ch.length-1;

        while(right > left){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp ;

            left++;
            right--;
        }

        System.out.println(new String(ch));
    }
}
