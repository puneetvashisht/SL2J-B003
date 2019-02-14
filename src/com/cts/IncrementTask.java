package com.cts;

public class IncrementTask implements Runnable {
	
	Employee e;

	public IncrementTask(Employee e) {
		super();
		this.e = e;
	}



	@Override
	public void run() {
		System.out.println("Incrementing salary by " + Thread.currentThread().getName());
		System.out.println(e);
		e.incrementSalary(322);
		System.out.println(e);
		
	}

}
