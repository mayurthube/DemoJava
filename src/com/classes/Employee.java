package com.classes;

import javax.swing.plaf.synth.SynthViewportUI;

public class Employee {

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	public static  synchronized void method1() {
		
	}
public  synchronized void method2() {
		
	}

public static  synchronized void method3() {
	
}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	public Employee(int empid, String name) {
		this.empId= empid;
		this.name=name;
	}
	int empId;
	String name;
	
	
	
}
