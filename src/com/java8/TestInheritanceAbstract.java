package com.java8;

public abstract class TestInheritanceAbstract {

	// An abstract function
    abstract void abstractFun(int x);
    abstract void abstractFun();
 // A non-abstract (or default) function
    public void normalFun()
    {
       System.out.println("TestInheritanceAbstract: Hello");
    }
}
