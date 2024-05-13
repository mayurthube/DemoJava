package com.oops.inheritance;

public class Child extends Parent{

	int age;
	Child(){
		super();
	}
	Child(int j){
		super();
		age = j;
	}
	void demo() {
		System.out.println("Child Demo");

	}
	void demo1() {
		System.out.println("Child Demo1");

	}
	public void demoOne() {
		System.out.println("Child demoOne");
	}
}
