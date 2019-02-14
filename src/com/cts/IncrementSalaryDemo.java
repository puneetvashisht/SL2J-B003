package com.cts;

import java.util.ArrayList;
import java.util.List;

public class IncrementSalaryDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(23, "Ravi", 34344.34);
		Employee e2 = new Employee(33, "Priya", 44344.34);
		Employee e3 = new Employee(21, "Ravi", 31344.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); employees.add(e2); employees.add(e3);
		
		IncrementTask task = new IncrementTask(e1);
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		
//				Employee [id=23, name=Ravi, salary=34344.34]
//				Employee [id=23, name=Ravi, salary=34344.34]
//				Employee [id=23, name=Ravi, salary=34988.34]
//				Employee [id=23, name=Ravi, salary=34988.34]
		
		
//		for(Employee e: employees){
//			IncrementTask task = new IncrementTask(e);
//			Thread t = new Thread(task);
//			t.start();
//		}
		
//		for(Employee e: employees){
//			System.out.println(e);
//			e.incrementSalary(322);
//			System.out.println(e);
//		}
		
//		System.out.println(e1);
//		e1.incrementSalary(322);
//		System.out.println(e1);
	}

}
