package com.collection.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.collection.arraylist.Student;

public class Data {
	List<Integer> intList;
	List<String> stringList;
	List<Student> studentList;
	public Data() {
		super();
		int[] ints = {1,2,3,6,9,4,11,17,2,13,25,51,33,34};
		this.intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
		String[] arr = { "Apple",   "Cat",    "Ball","Cartoon", "Banana", "Avocado","Cat" };
		this.stringList = Arrays.asList(arr);
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(223, "Mayur", 26,65));
		arraylist.add(new Student(245, "Nikhil", 24,58));
		arraylist.add(new Student(209, "Nilesh", 32,99));
		arraylist.add(new Student(235, "Anshul", 30,78));
		this.studentList =arraylist;
	}
	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}


