import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Queue<Integer> queue = new PriorityQueue<>();
		
//		Queue<Integer> queue = new LinkedList<>();
//		
//		queue.peek();
		
//		queue.offer(10);
//		queue.offer(43);
//		queue.addAll(Arrays.asList(43,34,65,33,65,65));
//		
//		System.out.println(queue);
//		
//		System.out.println(queue.peek());
//		System.out.println(queue.peek());

//		System.out.println(queue);
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
			
		Thread addingThread = new Thread(()->{
			try {
				queue.put(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		addingThread.start();
		
		Thread thread = new Thread(() ->  {
			System.out.println(Thread.currentThread().getName() + "is removing an element from the queue");
			
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			queue.remove();
		});
		
		thread.start();
		
		try {
			thread.join();
			addingThread.join();
			System.out.println(queue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
