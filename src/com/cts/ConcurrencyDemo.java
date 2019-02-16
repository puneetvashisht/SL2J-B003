package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
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
			IncrementTask task = new IncrementTask(e);
			service.submit(task);
		}
		

	}

}
