package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.collection.arraylist.Student;

public class QueryMain {

	public static void main(String[] args) {
		QueryMain qmain =new QueryMain();
		List<Employee> employeeList =qmain.initEmployee();
		
		//Query 1 : How many male and female employees are there in the organization?
		Map<String, Long> noOfMaleAndFemaleEmployees= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Male and female employees are there in the organization  :: "+noOfMaleAndFemaleEmployees);
		
		//Query 2 : Print the name of all departments in the organization?
		System.out.println("\nName of all departments in the organization ::");
		employeeList.stream().map(Employee :: getDepartment).distinct().forEach(System.out::println);

		//Query 3 : What is the average age of male and female employees
		Map<String, Double> maleAndFemaleEmpAvgAge = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender,Collectors.averagingInt(Employee:: getAge)));
		System.out.println("\nThe average age of male and female employees  :: "+maleAndFemaleEmpAvgAge);
		
		//Query 4 : Get the details of highest paid employee in the organization?
		Optional<Employee> highestPaidEmployeeWrapper=
		employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		System.out.println("\nGet the details of highest paid employee in the organization :: "+highestPaidEmployee);
		
		//Query 4.1 : Get the details of highest paid employee in the Product Development?
		Optional<Employee> highestPaidEmployeeByDepartmentWrapper=
		employeeList.stream().filter(e->e.department.equals("Product Development")).collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee highestPaidEmployeeByDepartment = highestPaidEmployeeByDepartmentWrapper.get();
		System.out.println("\nGet the details of highest paid employee in the Product Development :: "+highestPaidEmployeeByDepartment);
		
		//Query 5 : Get the names of all employees who have joined after 2015
		System.out.println("\nGet the names of all employees who have joined after 2015 ::");
		employeeList.stream().filter(e->e.yearOfJoining>2015).forEach(System.out::println);
		
		//Query 6 : Count the number of employees in each department?
		Map<String, Long> employeeCountByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));
		System.out.println("\nCount the number of employees in each department ::\n"+ employeeCountByDepartment);
		
		//Query 7 : What is the average salary of each department
		Map<String, Double> departmentAverageSal = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(Employee:: getSalary)));
		System.out.println("\nWhat is the average salary of each department ::\n"+ departmentAverageSal);
		
		//Query 8 : Get the details of youngest male employee in the product development department
		Optional<Employee> youngestEmployeeInDeptWrapper = employeeList.stream().filter(e-> e.getDepartment().equals("Product Development"))
				.collect(Collectors.minBy(Comparator.comparingInt(Employee :: getAge)));
		System.out.println("\nGet the details of youngest male employee in the product development department ::\n"
		+ youngestEmployeeInDeptWrapper.get());
		
		//Query 9 : Who has the most working experience in the organization
		Optional<Employee> mostExpEmpWrapper = employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee:: getYearOfJoining)));
		System.out.println("\nWho has the most working experience in the organization ::\n"
				+ mostExpEmpWrapper.get());
		
		//Query 10 : How many male and female employees are there in the sales and marketing team?
		Map<String, Long> maleFemaleCount = employeeList.stream().filter(e-> e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting()));
		System.out.println("\nHow many male and female employees are there in the sales and marketing team ::\n"
				+ maleFemaleCount);
		
		//Query 11 : What is the average salary of male and female employees
		Map<String, Double> maleFemaleAvgSalMap = employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("\nWhat is the average salary of male and female employees ::\n"
				+ maleFemaleAvgSalMap);
		
		//Query 12 : List down the names of all employees in each department?
		Map<String, List<Employee>> employeeByDepartment= employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment));
		System.out.println("\nList of the names of all employees in each department\n");
		for (Entry<String, List<Employee>> entry : employeeByDepartment.entrySet()) 
		{
		    System.out.println("--------------------------------------");
		             
		    System.out.println("Employees In "+entry.getKey() + " : ");
		             
		    System.out.println("--------------------------------------");
		             
		    List<Employee> list = entry.getValue();
		             
		    for (Employee e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}
		
		//Query 13 : What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics  salarySummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee:: getSalary));
		
		System.out.println("\nAverage Salary = "+salarySummaryStatistics.getAverage());
		System.out.println("Total Salary = "+salarySummaryStatistics.getSum());
		System.out.println("Max Salary = "+salarySummaryStatistics.getMax());
		System.out.println("Min Salary = "+salarySummaryStatistics.getMin());
		System.out.println("Employee count = "+salarySummaryStatistics.getCount());
		
		//Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		Map<Boolean, List<Employee>> partitionEmployeesByAge=
				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		System.out.println("\n");
		for (Entry<Boolean, List<Employee>> entry : partitionEmployeesByAge.entrySet()) 
		{
		    System.out.println("----------------------------");
		             
		    if (entry.getKey()) 
		    {
		        System.out.println("Employees older than 25 years :");
		    }
		    else
		    {
		        System.out.println("Employees younger than or equal to 25 years :");
		    }
		             
		    System.out.println("----------------------------");
		             
		    List<Employee> list = entry.getValue();
		             
		    for (Employee e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}
		
		//Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Optional<Employee> mapper = employeeList.stream().max(Comparator.comparingInt(Employee :: getAge));
		System.out.println("\nWho is the oldest employee in the organization? What is his age and which department he belongs to?\n"+mapper.get());
		
		Optional<Employee> oldestEmpWrapper = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee:: getAge)));
		System.out.println("\nWho is the oldest employee in the organization? What is his age and which department he belongs to?\n"+oldestEmpWrapper.get());
	}
	
	public List<Employee> initEmployee(){
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		return employeeList;
	}

}
