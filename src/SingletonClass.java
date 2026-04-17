public class SingletonClass {

    private static SingletonClass instance;

   private SingletonClass(){
    }

    public static SingletonClass getInstance(){

       if(instance == null){
           instance = new SingletonClass();
       }
       show();
       return instance;
    }

    public static void show(){
       System.out.println("Creating a singleton class...");
    }

    public static void main(String[] args) {

        SingletonClass instance1 = SingletonClass.getInstance();


    }
}
