package com.java8;

//Java program to demonstrate lambda expressions
//to implement a user defined functional interface.

//A sample functional interface (An interface with
//single abstract method
public interface FuncInterface {
	// An abstract function
    void abstractFun(int x);
  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("FuncInterface: Hello");
    }
 
    /*default void normalFun2()
    {
       System.out.println("FuncInterface: Hello");
    }*/
 // A non-abstract (or Static) function
    static void staticFun()
    {
       System.out.println("FuncInterface.staticFun");
    }
}
