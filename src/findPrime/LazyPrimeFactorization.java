package findPrime;

public class LazyPrimeFactorization implements Runnable {

    public boolean checkPrime(int number){
        boolean check = true;
        if (number == 1){
            check = false;
        }else
            for (int i = 2; i < number; i++){
                if (number%i == 0){
                    check = false;
                }
            }
        return check;
    }

    @Override
    public void run() {

        for (int i = 2; i < 100; i++){
            if (checkPrime(i)){
                System.out.println("C1 "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
