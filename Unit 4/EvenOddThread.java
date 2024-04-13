class EvenThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print(Thread.currentThread().getName() + ": " + i + "\t");
            }

        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print(Thread.currentThread().getName() + ": " + i + "\t");
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.setName(" Even thread\t");
        t2.setName(" odd thread\t");
        t1.start();
        t2.start();
    }
}