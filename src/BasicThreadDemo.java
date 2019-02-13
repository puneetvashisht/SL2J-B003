import java.util.ArrayList;
import java.util.List;

public class BasicThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Thread> threads = new ArrayList<>();
		
		for(int i=0;i<5;i++){
			Thread t = new Thread(new Runnable(){
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("New Thread: " + Thread.currentThread().getName());	
				}	
			});
			
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
