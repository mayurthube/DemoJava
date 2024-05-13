package com.java8;

public interface FuncInterfaceII {

	// An abstract function
    void abstractFun(int x);
  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
    
 // A non-abstract (or default) function
    default void normalFun2()
    {
       System.out.println("FuncInterfaceII: Hello");
    }
    
 // A non-abstract (or Static) function
    static void staticFun()
    {
       System.out.println("FuncInterfaceII.staticFun");
    }
}
