package com.java8.steramapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.Employee;

public class Problem1 {

	public static void main(String[] args) {
	
		List<String> stingList = Arrays.asList("tea","tee","world","sachin","programming");
		stingList.stream().filter(s->Arrays.stream(s.split("")).distinct().count() == s.length()).forEach(t-> System.out.println(t));
		List<String> stingList2 = stingList.stream().filter(s->Arrays.stream(s.split("")).distinct().count() == s.length()).collect(Collectors.toList());
		String maxStr = Collections.max(stingList2, Comparator.comparing(s -> s.length()));
		
		System.out.println("Distinct string with max length : "+maxStr);
	}

}
