
public class MyThread  extends Thread {
	
	//data members
	
	public MyThread(String name) {
		super(name);
	}
	
	
	//method with some logic here
	
	@Override
	public void run() {
		System.out.println("Thread starts " + Thread.currentThread().getName());
		
		for(int i=1; i<=10; i++) {
			System.out.println("\t " + Thread.currentThread().getName() + " : i = " + i);
		}
		
		System.out.println(Thread.currentThread().getName() + " Ended");
	}

}
