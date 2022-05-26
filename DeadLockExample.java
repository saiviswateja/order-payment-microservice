import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Philosopher extends Thread {
    private final Lock firstChopStick;
    private final Lock secondChopStick;
    private static int sushiCount = 500_000_000;
    Philosopher(String name, Lock firstChopStick, Lock secondChopStick) {
        this.firstChopStick = firstChopStick;
        this.secondChopStick = secondChopStick;
    }

    public void run() {
        while (sushiCount>0) {

            firstChopStick.lock();
            secondChopStick.lock();

            if(sushiCount>0) {
                sushiCount--;
                System.out.println(this.getName() + " took a piece! Sushi remaining " + sushiCount);
            }
            secondChopStick.lock();
            firstChopStick.lock();
        }
    }
}

public class DeadLockExample {

    public static void main(String[] args) {
        Lock chopStickA = new ReentrantLock();
        Lock chopStickB = new ReentrantLock();
        Lock chopStickC = new ReentrantLock();
        new Philosopher("Barren", chopStickA, chopStickB).start();
        new Philosopher("Olivier", chopStickB, chopStickC).start();
        new Philosopher("Ben", chopStickC, chopStickA).start();
    }
}
