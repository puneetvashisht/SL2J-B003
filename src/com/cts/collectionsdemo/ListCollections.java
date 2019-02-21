package com.cts.collectionsdemo;

import java.util.LinkedList;
import java.util.List;

import com.cts.Employee;

public class ListCollections {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(32, "Priya", 44343.34);
		Employee e3 = new Employee(52, "Sneha", 54343.34);
		
//		Employee employees[] = new Employee[2];
//		employees[0] = e1;
//		employees[1] = e2;
//		employees[2] = e3;
		
		
		List<Employee> employees = new LinkedList<>();
		employees.add(e1);employees.add(e2);employees.add(e3);
		
		
		System.out.println(employees.get(2));
		
		employees.add(1, new Employee(22,"Sonia", 43443.44));
		
		employees.remove(1);
		System.out.println(employees);
		
		
		
//		for(Employee e: employees){
//			System.out.println(e);
//		}
//		System.out.println(employees);
		
	}

}
