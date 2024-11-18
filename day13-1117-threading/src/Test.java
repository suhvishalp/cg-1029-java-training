
public class Test {

	
	private static class MyThreadTask extends Thread{
		
		//data members
		//methods
		
		//override run
		
		//override start
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is main() method");
		System.out.println("thread name : " + Thread.currentThread().getName());
		
		
		//..
		//..
		
//		Thread thread1 = new Thread(() -> {
//				// TODO Auto-generated method stub
//				System.out.println("Thread name " + Thread.currentThread().getName() + " started");
//				
//				for(int i=1; i<=10; i++) {
//					System.out.println("\t i: " + i);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//				System.out.println(Thread.currentThread().getName() + " Ended");
//			});
//		
//		thread1.start();
		
		Thread thread1 = new MyThread("T1");
		Thread thread2 = new MyThread("T2");
		
		thread1.start();
		thread2.start();
		
		for(int j=1; j<=10; j++) {
			System.out.println("main: j " + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main() method");
	}

}
