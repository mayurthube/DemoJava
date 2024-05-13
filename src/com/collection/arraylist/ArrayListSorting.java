package com.collection.arraylist;

import java.util.*;

public class ArrayListSorting {
	   public static void main(String args[]){
		   ArrayList<Student> arraylist = new ArrayList<Student>();
		   Student s1 = new Student(223, "Mayur", 26,65);
		   Student s2 = new Student(245, "Nikhil", 24,58);
		   Student s3 = new Student(209, "Nilesh", 32,99);
		   
		   
		   arraylist.add(s1);
		   arraylist.add(s2);
		   arraylist.add(s3);
		   try{
//			   Collections.sort(arraylist);
			   Collections.sort(arraylist, ArrayListSorting.StuRollno);
//			   Collections.sort(arraylist, Student.compareStudent);
		   }
		   catch(Exception e){
			   System.out.println("Exception e "+e.getMessage());
		   }

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	     }
		 /*Comparator for sorting the list by roll no*/
	    public static Comparator<Student> StuRollno = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
	
			   int rollno1 = s1.getRollno();
			   int rollno2 = s2.getRollno();
	
			   /*For ascending order*/
			   //return rollno1-rollno2;
	
			   /*For descending order*/
			   return rollno2-rollno1;
	   }};
}
