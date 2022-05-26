import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class HungryPerson extends Thread {
    public static int servings = 11;
    public static Lock serverLock = new ReentrantLock();
    public int personId;
    private static Condition soupTaken = serverLock.newCondition();

    public HungryPerson(int id) {
        personId = id;
    }

    public void run() {
        while(servings>0) {
            serverLock.lock();
            try {
                if((personId==servings%2) && servings>0) {
                    servings--;
                    System.out.format("Person %d took some soup! servings left: %d\n", personId, servings);
                } else {
                    System.out.format("Person %d checked and closed the lid\n", personId);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                serverLock.unlock();
            }
        }
    }
}

public class LockUnlockInEfficiencyExample {
    public static void main(String[] args) {
        for(int i=0;i<2;i++)
            new HungryPerson(i).start();
    }
}
