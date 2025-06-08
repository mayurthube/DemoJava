package com.thread;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 10; i++) {
			final int number = i; // Factorial of numbers from 1 to 10
			
				System.out.println("Factorial of " + number + " is: " + factorial(number));
			
				
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: " + (endTime - startTime) + " ms");
		
	}
	
	private static String factorial(int number) {
		// TODO Auto-generated method stub
		if (number < 0) {
			return "Undefined for negative numbers";
		}
		if (number == 0 || number == 1) {
			return "1";
		}
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}	
		if (result > Long.MAX_VALUE) {
			return "Result exceeds maximum limit for long type";
		}
		if (result < Long.MIN_VALUE) {
			return "Result is below minimum limit for long type";
		}
		if (result >= 0 && result <= Long.MAX_VALUE) {
			return String.valueOf(result);
		}
		return "Result is out of bounds for long type";
	} 

}
