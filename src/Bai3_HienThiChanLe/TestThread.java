package Bai3_HienThiChanLe;

public class TestThread {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        et.start();
        OddThread ot = new OddThread();
        ot.start();
    }
}
