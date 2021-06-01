package findPrime;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        Thread t1 = new Thread(lpf);

        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();
        Thread t2 = new Thread(opf);

        t1.start();
        t2.start();

    }
}
