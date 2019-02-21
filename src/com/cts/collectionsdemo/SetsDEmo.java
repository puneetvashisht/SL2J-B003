package com.cts.collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cts.Employee;

public class SetsDEmo {

	public static void main(String[] args) {
		Set<Integer> randomNumbers = new TreeSet<>();
		randomNumbers.add(34);
		randomNumbers.add(4);
		randomNumbers.add(44);
		randomNumbers.add(54);
		randomNumbers.add(39);
		boolean result = randomNumbers.add(4);
		System.out.println(result);
		
		System.out.println(randomNumbers);
		
		
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(32, "Priya", 44343.34);
		Employee e3 = new Employee(52, "Sneha", 54343.34);
		
		Employee e4 = new Employee(123, "Ravi", 34343.34);
		
		Set<Employee> employees = new TreeSet<>();
		employees.add(e1);employees.add(e2);employees.add(e3);
		employees.add(e4);
		System.out.println(employees);

	}

}
