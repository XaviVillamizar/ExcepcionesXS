package Throwable.Exception;

import java.util.concurrent.CyclicBarrier;

public class BrokenBarrierException {
   public static void main(String[] args) {
      int numThreads = true;
      CyclicBarrier barrier = new CyclicBarrier(3);

      for(int i = 0; i < 3; ++i) {
         Thread thread = new Thread(new Worker(barrier));
         thread.start();
      }

   }
}
