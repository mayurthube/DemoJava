package com.clone;

public class Test implements Cloneable {

	public Test() {
		super();
		x = 10;
	     y = 20;
	}
	int x, y;
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
