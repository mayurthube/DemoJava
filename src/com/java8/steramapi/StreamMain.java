package com.java8.steramapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.collection.arraylist.Student;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(2,3,8,4,5,6,7);
		System.out.println("number : "+number.toString());
		Stream<Integer> numb= number.stream();
		List<Integer> squreList= numb.map(x-> x*x*x).collect(Collectors.toList());
		squreList.forEach(t->System.out.println(t));
		System.out.println("------------------------");
		//numb.allMatch(x-> x==200);  // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		number.stream().filter(n-> n>=3).map(n-> n+1).forEach(n->System.out.println(n));
		
		System.out.println(number.stream().anyMatch(s->s+1 ==4));
		System.out.println(number.stream().allMatch(s->s <7));
		
		
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   Student s1 = new Student(223, "Mayur", 26,75);
		   Student s2 = new Student(245, "Nikhil", 24,60);
		   Student s3 = new Student(209, "Nilesh", 32,45);
		   arraylist.add(s3);
		   arraylist.add(s1);
		   arraylist.add(s2);
		 System.out.println("Before arraylist"+arraylist);
		    List<Student> mapStudent = arraylist.stream().filter(s->s.getStudentage()>=25).map(s->{
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
		
	}

}
