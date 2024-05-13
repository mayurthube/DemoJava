package com.classes;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo {

	   public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

	     try {
	    	 
	    	 
	        Class cls = Class.forName("com.oops.inheritance.Parent");
	        Integer i =new Integer(5);
	        Class[] ca = {i.getClass()};

	        Constructor constructor = cls.getConstructor();
	        Object[] o = {i};
	        Object parent = constructor.newInstance((Object) null);
	        cls.getClass().getMethod("demo", null).invoke(cls);
	    	
	        // returns the ClassLoader object
	        ClassLoader cLoader = cls.getClassLoader();
	       
	        /* returns the Class object associated with the class or interface 
	        with the given string name, using the given classloader. */
//	        Class cls2 = Class.forName("java.lang.Thread", true, cLoader);       
	          
	        // returns the name of the class
	        System.out.println("Class = " + cls.getName());
//	        System.out.println("Class = " + cls2.getName()); 
	        /*Constructor[] con = cls.getConstructors();
	        System.out.println(con.length);
	        for(int i =0; i< con.length; i++){
	        	System.out.println(i+"con:: "+con[i]);
	        	System.out.println(i+"Name:: "+con[i].getName());
	        	System.out.println(i+"Modifiers:: "+con[i].getModifiers());
	        }*/
	     }
	     catch(ClassNotFoundException ex) {
	        System.out.println(ex.toString());
	     } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
}
