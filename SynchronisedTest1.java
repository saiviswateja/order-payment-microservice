class Shopper extends Thread {
    public int garlicCount = 0;

    public int getGarlicCount() {
        return garlicCount;
    }

    public void run() {
        for(int i=0;i<1000000;i++) {
            garlicCount++;
        }
    }
}

public class SynchronisedTest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("Vomplrtrf shopping "+ ((Shopper)olivia).garlicCount);
        System.out.println("Vomplrtrf shopping "+ ((Shopper)barron).garlicCount);
    }
}
