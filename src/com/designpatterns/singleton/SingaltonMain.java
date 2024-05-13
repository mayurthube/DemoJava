package com.designpatterns.singleton;

public class SingaltonMain {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println("s :"+s.s);
		
		Singleton p = Singleton.getInstance();
		System.out.println("p :"+p.s);
	}

}
