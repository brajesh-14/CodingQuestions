package Java8Practice;

interface Message{
    void say();
}
public class HelloWorld {

    public static void main(String[] args) {

        Message m = () -> {
            System.out.println("Hello Lambda");
        };

        m.say();
    }
}


/*public class HelloWorld implements Message{

    @Override
    public void say() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.say();
    }
}*/
