public class CheckString {

    public static void main(String[] args) {
        String s = "1gs2g34t5";
        String digit = "";
        String letter = "";
        String specialCh = "";

        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                digit = digit + ch;
            } else if (Character.isLetter(ch)) {
                letter = letter + ch;
            } else {
                specialCh = specialCh + ch;
            }
        }

        System.out.println("Letters present in the strings are: " + letter + " and the digits are: " + digit + " and the special characters are: " + specialCh);
    }
}
