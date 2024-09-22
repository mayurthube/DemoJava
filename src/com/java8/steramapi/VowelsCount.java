package com.java8.steramapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsCount {

	public static void main(String[] args) {
		String str = "Auto-generated method stub";
			
		 // Define a list of vowels
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        // Count the vowels using the Stream API
        long vowelCount = str.chars()
                               .mapToObj(c -> (char) c) // Convert int stream to char stream
                               .filter(vowels::contains) // Keep only vowels
                               .distinct()
                               .count(); // Count the remaining characters
        
        System.out.println("Number of vowels: " + vowelCount);

	
	}

}
