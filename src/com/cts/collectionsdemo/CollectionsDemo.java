package com.cts.collectionsdemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.cts.Employee;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(32, "Priya", 44343.34);
		Employee e3 = new Employee(2, "Sneha", 54343.34);
		
		
		List<Employee> employees = new LinkedList<>();
		employees.add(e1);employees.add(e2);employees.add(e3);
		
		System.out.println(employees);
		
//		Collections.sort(employees);
		Collections.sort(employees, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
			
		});
		
		System.out.println(employees);

	}

}
