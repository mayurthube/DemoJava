package com.java8.steramapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.Employee;
import com.java8.QueryMain;

public class StreamApiQuery {

	public static void main(String[] args) {
		QueryMain qmain =new QueryMain();
		List<Employee> employeeList =qmain.initEmployee();
		
		//Query 1 : How many male and female employees are there in the organization?
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting()));
		System.out.println("Male and female employees are there in the organization  :: "+noOfMaleAndFemaleEmployees);
		
		//Query 2 : Print the name of all departments in the organization?
		System.out.println("\nName of all departments in the organization ::");
		employeeList.stream().map(e-> e.getDepartment()).distinct().forEach(System.out::println);
		
		//Query 3 : What is the average age of male and female employees
		Map<String, Double> avgAgeofMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println("\nThe average age of male and female employees  :: "+avgAgeofMaleAndFemaleEmployees);
		
		//Query 4 : Get the details of highest paid employee in the organization?
		
	}
}
