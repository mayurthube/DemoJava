package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.collection.arraylist.Student;

public class StreamMain {

	public static void main(String[] args) {
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   Student s1 = new Student(223, "Mayur", 26,75);
		   Student s2 = new Student(245, "Nikhil", 24,60);
		   Student s3 = new Student(209, "Nilesh", 32,45);
		
		List<Integer> number = Arrays.asList(2,3,8,4,5,6,7);
		List<Integer> squreList= number.stream().map(x-> x*x*x).collect(Collectors.toList());
		squreList.forEach(t->System.out.println(t));
	}

}
