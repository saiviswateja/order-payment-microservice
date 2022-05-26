import java.util.concurrent.locks.ReentrantLock;

class CalenderUser extends Thread {
    private static final String[] WEEKDAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static int today = 0;
    private static ReentrantLock marker = new ReentrantLock();

    CalenderUser(String name) {
        this.setName(name);
    }

    public void run() {
        while (today< WEEKDAYS.length - 1) {
            if(this.getName().contains("Writer")) {
                marker.lock();
                try {
                    today = (today + 1) % 7;
                    System.out.println(this.getName() + " updated date to " + WEEKDAYS[today]);
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    marker.unlock();
                }
            } else {
                marker.lock();
                try {
                    System.out.println(this.getName() + " sees that today is " + WEEKDAYS[today]);
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    marker.unlock();
                }
            }
        }
    }
}

public class ReadWriteLock {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            new CalenderUser("Reader-"+i).start();

        for(int i=0;i<2;i++)
            new CalenderUser("Writer-"+i).start();
    }
}
