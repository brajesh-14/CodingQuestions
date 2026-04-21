package Java8Practice;

interface Add{
    int sum(int a, int b);
}
public class AddTwoNum {

    public static void main(String[] args) {

        Add add = (a, b) -> {
            int result = a + b;

            return result;
        };

        System.out.println("Addition of two numbers are: "+ add.sum(10,12));
    }
}
