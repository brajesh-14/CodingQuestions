public class PrintRandomNo {

    public static void main(String[] args) {

        int randm = 0;
        for(int i=0; i<10; i++){

            randm = (int)(Math.random()*10);

        }
        System.out.println(randm);
    }
}
