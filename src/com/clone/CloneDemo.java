package com.clone;

public class CloneDemo {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * Shallow copy
		 */
		Test ob1 = new Test();
        System.out.println(ob1.x + " " + ob1.y);
        // Creating a new reference variable ob2
        // pointing to same address as ob1
        Test ob2 = ob1;
 
        // Any change made in ob2 will
        // be reflected in ob1
        ob2.x = 100;
        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
        
        /**
         * Deep Copy
         */
        System.out.println("Deep Copy");
        Test ob3 = new Test();
        ob3.x = ob1.x;
        ob3.y = ob1.y;
        System.out.println("     x  y ");
        System.out.println("ob1 "+ob1.x + " " + ob1.y);
        System.out.println("ob3 "+ob3.x + " " + ob3.y);
        
        /*
         * Using clone method
         */
        System.out.println("Using clone method");
        Test ob4 = (Test) ob1.clone();
        ob4.x = 25;
        System.out.println("     x  y ");
        System.out.println("ob1 "+ob1.x + " " + ob1.y);
        System.out.println("ob4 "+ob4.x + " " + ob4.y);
	}

}
