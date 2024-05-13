package com.oops.inheritance;

public class ChildFirst extends Parent{

	int age;
	ChildFirst(){
		//super();
	}
	ChildFirst(int j){
		age = j;
	}
	void demo() {
		System.out.println("ChildFirst Demo");

	}
}
