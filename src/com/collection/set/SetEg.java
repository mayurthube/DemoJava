package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetEg {
	
	public static void main(String args[]) {
		// We create a new, empty set
		Set<String> mySet = new HashSet<String>();
		mySet.add("Mayur");
		mySet.add("Alok");
		mySet.add("Nikhil");
		mySet.add("Shubham");
		System.out.println("  "+mySet.add("Alok"));
		
		// Print the elements of the Set
		System.out.println("mySet : " + mySet);
		
		Employee empOne = new Employee(26, "Mayur");
		Employee empTwo = new Employee(26, "Mayur");
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(empOne);
		empSet.add(empTwo);
		
		System.out.println("empSet.size() : " + empSet.size());
		System.out.println("empSet : " + empSet);
		
	}
}
