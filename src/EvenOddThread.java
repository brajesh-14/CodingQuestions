import java.io.PrintStream;
import java.util.Objects;

public class EvenOddThread {

    int count = 1;
    int N = 10;

    public void printOdd() {
        while(this.count <= this.N) {
            if (this.count % 2 == 0) {
                try {
                    this.wait();
                } catch (Exception var2) {
                }
            } else {
                PrintStream var10000 = System.out;
                String var10001 = Thread.currentThread().getName();
                var10000.println("Odd : " + var10001 + this.count++);
                this.notify();
            }
        }

    }

    public void printEven() {
        while(this.count <= this.N) {
            if (this.count % 2 != 0) {
                try {
                    this.wait();
                } catch (Exception var2) {
                }
            } else {
                PrintStream var10000 = System.out;
                String var10001 = Thread.currentThread().getName();
                var10000.println("Even : " + var10001 + this.count++);
                this.notify();
            }
        }

    }

    public static void main(String[] args) {
        EvenOddThread eo = new EvenOddThread();
        Objects.requireNonNull(eo);
        Thread t1 = new Thread(eo::printEven);
        t1.start();
        Objects.requireNonNull(eo);
        Thread t2 = new Thread(eo::printOdd);
        t2.start();
    }
}
