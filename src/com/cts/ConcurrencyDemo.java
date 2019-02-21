package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		
//		ExecutorService service = Executors.newFixedThreadPool(4);
		
		ExecutorService service = new ThreadPoolExecutor(2, 4,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(2));
//		Thread t = new Thread();
//		ThreadPoolExecutor t;
		
		Employee e1 = new Employee(23, "Ravi", 34344.34);
		Employee e2 = new Employee(33, "Priya", 44344.34);
		Employee e3 = new Employee(21, "Ravi", 31344.34);
		Employee e4 = new Employee(23, "Ravi", 34344.34);
		Employee e5 = new Employee(33, "Priya", 44344.34);
		Employee e6 = new Employee(21, "Ravi", 31344.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); employees.add(e2); employees.add(e3);
		employees.add(e4); employees.add(e5); employees.add(e6);	
		for(Employee e : employees){
			IncrementCallable task = new IncrementCallable(e);
			Future<Double> future = service.submit(task);
			try {
				Double incrementedSalary = future.get();
				System.out.println("Salary incremented is:  " + incrementedSalary);
			} catch (InterruptedException | ExecutionException e7) {
				// TODO Auto-generated catch block
				e7.printStackTrace();
			}
			
			// Future.get is blocking method, results in sequential execution of threads 
//			and slows down whole execution. We still want parallel execution.
//			It is possible if we dont call .get() method and rather store future objects in
//			a list and then fire .get() method. Or even better use CompletionService.
			
			
		}
		

	}

}
