package com.oops.inheritance;

//import sun.io.CharToByteMacIceland;

public class Main {
	
	public static void main(String args[]) {
		Parent p = new Child();
		Child c = new Child();
		ChildFirst cf = new ChildFirst();
		Parent p1 = new Parent();
		//Child c1 =new Parent();
		
		c.demo();
		c.demo1();
		c.demo();
		c.demoOne();
		p1.demo();
		p.demoOne();
		cf.demoOne();
		p1.demoOne();
	}

}


