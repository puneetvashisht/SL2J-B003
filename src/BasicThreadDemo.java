import java.util.ArrayList;
import java.util.List;

public class BasicThreadDemo {
	
	public static int add(Integer x, Integer y){
		return x+y;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Thread> threads = new ArrayList<>();
		
//		threads.add(e)
		int result = add(4,5);
		System.out.println(result);
		
		for(int i=0;i<5;i++){
			Thread t = new Thread(new MyRunnable());
			
			t.start();
//			t.join();
			threads.add(t);
		}
		
		for(Thread t : threads){
			t.join();
		}
		
//		t.join()
		
		
		System.out.println("New Thread: " + Thread.currentThread().getName());
		
		
		
	}

}
