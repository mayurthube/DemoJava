package com.java8.steramapi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		Optional<Employee> highestPaid = employeeList.stream().max(Comparator.comparingDouble(e->e.getSalary()));
		System.out.println("\nGet the details of highest paid employee in the organization 1:: "+highestPaid.get());
		Optional<Employee> highestPaidEmployeeWrapper= employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("\nGet the details of highest paid employee in the organization 2:: "+highestPaid.get());
		Employee emp = Collections.max(employeeList,Comparator.comparingDouble(Employee::getSalary));
		System.out.println("\nGet the details of highest paid employee in the organization 3:: "+emp);
		
		//Query 4.1 : Get the details of highest paid employee in the Account And Finance?
		Optional<Employee> highestPaidEmpInDept = employeeList.stream().filter(e->e.getDepartment().equals("Account And Finance")).max(Comparator.comparingDouble(e->e.getSalary()));
		System.out.println("\nGet the details of highest paid employee in the Account And Finance:: "+highestPaidEmpInDept.get());
		Optional<Employee> highestPaidEmpInDeptWrapper= employeeList.stream().filter(e->e.getDepartment().equals("Account And Finance")).collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("\nGet the details of highest paid employee in the Account And Finance 2:: "+highestPaidEmpInDeptWrapper.get());
		
		//Query 5 : Get the names of all employees who have joined after 2015
		System.out.println("\nGet the names of all employees who have joined after 2015 ::");
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(System.out::println);
		
		//Query 6 : Count the number of employees in each department?
		Map<String, Long> departmentWiseEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));
		System.out.println("\nCount the number of employees in each department ::\n"+ departmentWiseEmployee);
		
		//Query 7 : What is the average salary of each department
		Map<String, Double> departmentWiseAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee:: getSalary)));
		System.out.println("\nWhat is the average salary of each department ::\n"+ departmentWiseAvgSalary);
		
		//Query 8 : Get the details of youngest male employee in the product development department
		
		
	}
}
