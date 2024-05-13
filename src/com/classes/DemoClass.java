package com.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DemoClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Mayur Thube");
		Employee emp2 = new Employee(2, "Mayur Thube");
		Employee emp3 = new Employee(1, "Mayur Thube");
		
		Map<Employee, String> epMap = new HashMap<Employee, String>();
		epMap.put(emp2, "emp2");
		epMap.put(emp1, "emp1");
//		epMap.put(emp3, "emp1");
		
		System.out.println(epMap.get(emp1));
		
		
		int i=7;
		System.out.println(++i - i++);
		System.out.println(i);
		/*FunctionalInterface fi = (int a, int b) ->{
			return a+b;
		};*/
		
	}

}
