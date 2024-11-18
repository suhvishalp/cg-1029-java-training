
public class InterruptTest {

	public static void main(String[] args) {
        
		Thread t1 = new Thread(new ThreadInterruptExample());
        
        t1.start();
        
        try {
              Thread.sleep(10000);
              t1.interrupt();
        } catch (InterruptedException ex) {
              // do nothing
        }
  }
}


