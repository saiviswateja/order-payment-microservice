import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TryLockShopper extends Thread {
    private int itemsToAdd = 0;
    private static int itemsOnNotepad = 0;
    private static Lock pencil = new ReentrantLock();

    public TryLockShopper(String str) {
        this.setName(str);
    }

    public void run() {
        while (itemsOnNotepad<=20) {
            if(itemsToAdd>0 && pencil.tryLock()) {
                try {
                    pencil.lock();
                    itemsOnNotepad += itemsToAdd;
                    System.out.println(this.getName() + " added " + itemsToAdd + " items to notepad");
                    itemsToAdd = 0;
                    Thread.sleep(300);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                } finally {
                    pencil.unlock();
                }
            } else {
                try {
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(this.getName());
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}

public class TryLockDemo {
    public static void main(String[] args) {
        Thread barron = new TryLockShopper("Barron");
        Thread olivia = new TryLockShopper("Olivia");
        long start = System.currentTimeMillis();
        barron.start();
        olivia.start();
        long finish = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (float)(finish-start)/1000 + " seconds");
    }
}
