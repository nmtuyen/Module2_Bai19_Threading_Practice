package Bai3_HienThiChanLe;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread et = new EvenThread();
        Thread t = new Thread(et);

        OddThread ot = new OddThread();
        Thread h = new Thread(ot);
        ot.start();
        ot.join();
        et.start();
    }
}
