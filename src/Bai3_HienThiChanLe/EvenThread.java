package Bai3_HienThiChanLe;

public class EvenThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Danh sách số chẵn từ 1 đến 10 là: ");
        for (int i = 0; i <= 10; i++){
            if (i%2==0)
                System.out.print(i+",");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
