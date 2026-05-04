package Java8Practice;

interface CheckString{

    boolean check(String s);
}
public class CheckStringStarts {

    public static void main(String[] args) {


        CheckString c = (str) -> {
            return str.startsWith("A");
        };

        System.out.println(c.check("Amrit"));
    }
}
