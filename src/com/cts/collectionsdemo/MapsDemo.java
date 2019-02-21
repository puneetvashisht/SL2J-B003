package com.cts.collectionsdemo;

import java.util.Map;
import java.util.TreeMap;

import com.cts.Employee;

public class MapsDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(32, "Priya", 44343.34);
		Employee e3 = new Employee(52, "Sneha", 54343.34);
		Map<Integer, Employee> employeeMap = new TreeMap<>();
		
		employeeMap.put(12, e1);
		employeeMap.put(32, e2);
//		employeeMap.put(32, e3);
		employeeMap.put(52, e3);
		
		System.out.println(employeeMap);
		Employee emp = employeeMap.get(32);
		System.out.println(emp);
		
		System.out.println(employeeMap.keySet());
		
		for(Integer key : employeeMap.keySet()){
			System.out.println(employeeMap.get(key));
		}

	}

}
