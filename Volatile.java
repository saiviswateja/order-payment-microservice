import java.util.Scanner;

public class Volatile extends Thread {
    private volatile boolean bool = true;

    public void run() {
        while(bool) {
            System.out.println("Hello Teja, just checking the volatile method");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        bool = false;
    }

    public static void main(String[] args) {
        Volatile vol = new Volatile();
        vol.start();
        System.out.println("Enter any input");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        vol.stopThread();
    }
}
