package com.wrapper;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
		  Integer iob = 100;      //Autoboxing of int
		  int i = iob;          //unboxing of Integer
		  System.out.println(i+" "+iob);

		  Character cob = 'a';       //Autoboxing of char
		  char ch = cob;            //Auto-unboxing of Character
		  System.out.println(cob+" "+ch);
		  int [] array = {1,5,8,5,2,12,9};
		  ArrayList<Integer> alist = new ArrayList<>();
		  for(int j=0;j< array.length;i++)
			  alist.add(Integer.parseInt(""+array[j]));
		  //System.out.println(Main.processArray(alist));
	}

}
