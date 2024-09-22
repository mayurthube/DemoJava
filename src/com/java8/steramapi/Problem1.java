package com.java8.steramapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java8.Employee;
import com.java8.QueryMain;

public class Problem1 {

	public static void main(String[] args) {
		QueryMain qmain =new QueryMain();
		List<Employee> employeeList =qmain.initEmployee();
		List<Integer> intList = new ArrayList<>(Arrays.asList(2,4,3,10,2,1,55,19,9,7,6,6,5,19));
		List<Integer> intList2 = new ArrayList<>(Arrays.asList(5,19,3,7,21,8,5,19,22));
	
		List<String> stingList = Arrays.asList("tea","tee","world","sachin","programming");
		stingList.stream().filter(s->Arrays.stream(s.split("")).distinct().count() == s.length()).forEach(t-> System.out.println(t));
		List<String> stingList2 = stingList.stream().filter(s->Arrays.stream(s.split("")).distinct().count() == s.length()).collect(Collectors.toList());
		String maxStr = Collections.max(stingList2, Comparator.comparing(s -> s.length()));
		
		System.out.println("Distinct string with max length : "+maxStr);
	
	
	
	//1. Find the average salary of each department using stream APIs.
		
		Map<String, Double> departmentViseAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee:: getSalary)));
		System.out.println("\nAverage salary of each department : "+departmentViseAvgSalary);
		
	//2. Find the first non repeated number in the given list using streams.
		System.out.println("\n---2.First non repeated number in the given list---");
		// Solution 1:
		System.out.println("\nInt List :"+intList.toString());
		 List<Integer> duplicateList = intList.stream().filter(n ->Collections.frequency(intList, n)>1).distinct().collect(Collectors.toList());
		 System.out.println("\nduplicateList :"+duplicateList.toString());
		 List<Integer> nonrepetedNumbers = intList.stream().filter(n -> !duplicateList.contains(n)).collect(Collectors.toList());
		 System.out.println("\nnonrepetedNumbers :"+nonrepetedNumbers.toString());
		 System.out.println("\nFirst non repeated number is :"+nonrepetedNumbers.get(0));
		//Solution 2 -Chat GPT
		 Optional<Integer> firstNonRepeated = intList.stream()
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		            .entrySet().stream()
		            .filter(entry -> entry.getValue() == 1)
		            .map(Map.Entry::getKey)
		            .findFirst();

		        firstNonRepeated.ifPresent(System.out::println);
		 
	//3. Increase salary by 10% for employees with rating > 4
		System.out.println("\n---3. Increase salary by 10% for employees with rating > 4---");
		List<Employee> empList = employeeList.stream().map(emp ->{
			if(emp.getRating()>=4) {
				Double sal =emp.getSalary();
				//System.out.println("Before Sal :"+sal);
				emp.setSalary(emp.getSalary()+(10*sal/100));
				//System.out.println("Before After :"+emp.getSalary());
			}
			return emp;
		}).collect(Collectors.toList());   
		System.out.println("Employee List after 10% increas:"+empList);        
	//4. Find the Intersection (Common element) of Two Lists Using Streams
		System.out.println("\n---4. Find the Intersection (Common element) of Two Lists Using Streams---");
		System.out.println("IntList:"+intList); 
		System.out.println("IntList2:"+intList2); 
		List<Integer> commonElements = intList.stream().filter(n-> intList2.contains(n)).collect(Collectors.toList());
		System.out.println("Intersection (Common element) of Two Lists :"+commonElements); 
		
	//5. Find the longest word in the given sentence using streams
		System.out.println("\n---5. Find the longest word in the given sentence using streams---");
		String stamenet = "apple banana cat dog elephant frog grape house igloo jelly kite lemon mango notebook orange pineapple quilt rabbit sun turtle umbrella violin whale xylophone yellow zebr";
		Optional<String> longestWord = Arrays.asList(stamenet.split(" ")).stream().max(Comparator.comparingInt(s -> s.length()));
		System.out.println("the longest word in the given sentence :"+longestWord.get()); 
	//6. Find the Max salary of each department using stream APIs.
		Map<String, Optional<Employee>> deptWiseMaxSal = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.maxBy(Comparator.comparingDouble(emp->emp.getSalary()))));
		System.out.println("Max salary of each department :");
		deptWiseMaxSal.entrySet().forEach(entry->System.out.println(entry.getKey()+ "   "+entry.getValue().get().getSalary())); 
	//7. Find the Nth Max salary using stream APIs.
	//8. Reverse each word of String using stream.
		System.out.println("\n---8. Reverse each word of String using stream---"); 
		System.out.println("String to reverse :"+stamenet); 
		 String reverse = Arrays.stream(stamenet.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		 System.out.println("String after  reverse :"+reverse); 
	//9. Sorted by multiple fields using stream APIs.
		 System.out.println("\n---9. Sorted by multiple fields using stream APIs.---"); 
		 List<Employee> sortedEmployeeList = empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getRating)).collect(Collectors.toList());
		 System.out.println("Sorted employee list :"+sortedEmployeeList);
	//10.Sorted list of employee where employee age>25 and sorting based on salary ascending order
		 System.out.println("\n---9. Sorted by multiple fields using stream APIs.---"); 
		 List<Employee> sortedEmployeeListBy = empList.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		 System.out.println("Sorted employee list :"+sortedEmployeeList);
	//11. Union Between two list Using Streams.
		 // same as 4 
	//12. Find Second Highest element from Integer Array.
		 System.out.println("\n---12. Find Second Highest element from Integer Array.---"); 
		 System.out.println("\nList to sort :"+intList); 
		 Optional<Integer> seconfHighst =intList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		 System.out.println("\nList to sort :"+seconfHighst.get()); 
	//13. Find the index of vowels from given String.
	//14. Find duplicate element from list.
		 System.out.println("\n---14. Find duplicate element from listy.---"); 
		 List<Integer> duplicateElem = intList.stream().filter(n-> Collections.frequency(intList, n)>1).distinct().collect(Collectors.toList());
		 System.out.println("\nDuplicate list :"+duplicateElem); 
	//15. Reverse the String by word (I/p : Java is Programming Language & O/p : Language Programming is Java)
		 String reverseStr = Arrays.stream("Java is Programming Language".split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), list->{Collections.reverse(list); return String.join(" ", list); })).toString();
		 System.out.println("\nreverseStr :"+reverseStr); 
	//16. Find Min Integer Value between more then one Integer.
	//I/O : Integer i = 10 , Integer j = 20 , Integer k = 30  & O/p : 10 

	//17. Find Max Integer Value between more then one Integer.
	//I/O : Integer i = 10 , Integer j = 20 , Integer k = 30  & O/p : 30
	}
}
