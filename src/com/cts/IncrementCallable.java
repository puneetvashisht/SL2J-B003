package com.cts;

import java.util.concurrent.Callable;

public class IncrementCallable implements Callable<Double> {

	
	Employee e;

	public IncrementCallable(Employee e) {
		super();
		this.e = e;
	}
	@Override
	public Double call() throws Exception {
		System.out.println("Incrementing salary by " + Thread.currentThread().getName());
		System.out.println(e);
		e.incrementSalary(322);
		System.out.println(e);
		return e.getSalary();
	}

}
