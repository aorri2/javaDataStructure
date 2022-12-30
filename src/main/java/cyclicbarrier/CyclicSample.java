package cyclicbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicSample {
    private final static int THREADS = 5;
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(THREADS);

    static class RandomSleepRunnable implements Runnable{
        private int id = 0;
        private static Random random = new Random(System.currentTimeMillis());

        public RandomSleepRunnable(final int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Thread(" + id + ") : start.");
            int delay = random.nextInt(1001) + 1000;
            try{
                System.out.println("Thread(" + id + ") : sleep" + delay + "ms");
                Thread.sleep(delay);
                System.out.println("Thread(" + id + ") : End Sleep");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            try{
                cyclicBarrier.await();
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println("Thread(" + id + ") : End.");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < THREADS; ++i) {
            new Thread(new RandomSleepRunnable(i)).start();

        }
    }
}
