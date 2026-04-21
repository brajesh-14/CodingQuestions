public class BalanceParenthesis {

    public static void main(String[] args) {

        String input = "[[()]]";

        int a=0, aa=0;
        int b=0, bb=0;
        int c=0, cc=0;

        char[] ch = input.toCharArray();

        for(int i =0; i<ch.length; i++){

            if(ch[i]=='['){
                a++;
            } else if (ch[i]==']') {
                aa++;
            } else if (ch[i]=='{') {
                b++;
            } else if (ch[i]=='}') {
                bb++;
            } else if (ch[i]=='(') {
                c++;
            } else if (ch[i]==')') {
                cc++;
            }
        }
        if(a == aa && b == bb && c == cc){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
