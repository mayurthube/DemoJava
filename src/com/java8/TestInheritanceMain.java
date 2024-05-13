package com.java8;

public class TestInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInheritance ti = new TestInheritance();
		ti.abstractFun(5);
		ti.normalFun(); // parent class has super power over interface
		ti.normalFun2();
		FuncInterfaceII.staticFun();
		FuncInterface.staticFun();
		
	}

}
