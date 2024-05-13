package com.java8.steramapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.collection.arraylist.Student;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   Student s1 = new Student(223, "Mayur", 26,75);
		   Student s2 = new Student(245, "Nikhil", 24,60);
		   Student s3 = new Student(209, "Nilesh", 32,45);
		   
		   arraylist.add(s3);
		   arraylist.add(s1);
		   arraylist.add(s2);
		   
		   
		// create a list of integers
	    List<Integer> number = Arrays.asList(2,3,8,4,5,6,7);
	  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    Set<Integer> squareSet = number.stream().map(x -> x*x).
                collect(Collectors.toSet());
	    System.out.println("Map List"+square);
	    System.out.println("Map Set"+squareSet);
	    
	 // demonstration of map method on java objects list
	    System.out.println("Before arraylist"+arraylist);
	    List<Student> mapStudent = arraylist.stream().map(s->{
	    	s.setStudentage(s.getStudentage()+1);
	    	s.setRollno(s.getRollno()-1);
	    	if(s.getMarks()>70)
	    		s.setGrade("A");
	    	else if(s.getMarks()<70 && s.getMarks()>60)
	    		s.setGrade("B");
	    	else
	    		s.setGrade("c");
	    	return s;
	    }).collect(Collectors.toList());
	    System.out.println("Map Student List"+mapStudent);
	    //System.out.println("After arraylist"+arraylist);
	    
	    
	 // demonstration of filter method
	    List<Integer> result = number.stream().filter(s->s%2==0).
	                          collect(Collectors.toList());
	    System.out.println(result);
	    
	    
	 // demonstration of sorted method
	    List<Integer> show =
	    		number.stream().sorted().collect(Collectors.toList());
	    System.out.println("sorted method : "+show);
	    
	    Comparator<Student> reverseComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getStudentname().compareTo(s2.getStudentname());
            }		
        };		
	    List<Student> show2 =
	    		arraylist.stream().sorted(reverseComparator	).collect(Collectors.toList());
	    System.out.println("sorted method : "+show2);
	     
	}

}
