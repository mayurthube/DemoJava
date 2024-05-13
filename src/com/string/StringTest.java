package com.string;

public class StringTest {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abc");
		String s2 = "abc";
		String s3 =new String(s1);
		String s4 = s2;
		String s5 = new String("abc");
		String s6 =s1;
		char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		System.out.println("a :: " + a.toString());
//		s1.substring(4);
		System.out.println("s1 == s2 :: " + (s1 == s2));
		System.out.println("s1 equals s2 :: " + (s1.equals(s2)));
		
		System.out.println("s1 == s3 :: " + (s1 == s3));
		System.out.println("s1 equals s3 :: " + (s1.equals(s3)));
		
		System.out.println("s4 == s2 :: " + (s4 == s2));
		System.out.println("s4 equals s2 :: " + (s4.equals(s2)));
		
		System.out.println("s3 == s2 :: " + (s3 == s2));
		System.out.println("s3 equals s2 :: " + (s3.equals(s2)));
		
		System.out.println("s1 == s5 :: " + (s1 == s5));
		System.out.println("s1 equals s5 :: " + (s1.equals(s5)));
		
		System.out.println("s1 == s6 :: " + (s1 == s6));
		System.out.println("s1 equals s6 :: " + (s1.equals(s6)));
		
		String testStr ="Mayur1";
		String name =new String("Mayur1");
		System.out.println("testStr == name :: " + (testStr == name));
		System.out.println("testStr equals name :: " + (testStr.equals(name)));
		name = name.intern();
		System.out.println("testStr == name :: " + (testStr == name));
		System.out.println("testStr equals name :: " + (testStr.equals(name)));
		//name.in
		
		
	}

}
