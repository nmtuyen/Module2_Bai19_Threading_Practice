package Bai3_HienThiChanLe;

public class OddThread extends Thread{
    @Override
    public void run() {
        super.run();

        for (int i = 0; i <= 10; i++){
            if (i%2!=0)
                System.out.println("Le "+i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
