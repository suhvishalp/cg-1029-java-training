public class ThreadInterruptExample implements Runnable {
      public void run() {
            for (int i = 1; i <= 10; i++) {
                  System.out.println("This is message #" + i);
                  try {
                        Thread.sleep(30000);
                        continue;
                  } catch (InterruptedException ex) {
                        System.out.println("I'm resumed");
                  }
            }
      }
}