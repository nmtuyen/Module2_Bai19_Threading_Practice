package Bai3_HienThiChanLe;

public class EvenThread extends Thread{
    @Override
    public void run() {
        super.run();

        for (int i = 0; i <= 10; i++){
            if (i%2==0)
                System.out.println("Chan "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
        }
    }

