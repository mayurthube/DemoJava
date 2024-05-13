package com.wrapper;

/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
    	
	   	 Integer oddCount = 0, tempInt;
 	   	 ArrayList<Integer> tempArray = new ArrayList<Integer>();
	   	 for(int i =0; i < array.size(); i++){
	   		 tempInt = array.get(i);
	   		 if(tempInt % 2 != 0){
	   			if(oddCount != 0){
	   				tempArray.add(i-1);
	   			}
	   			oddCount++;
	   			
	   			if (i == (array.size() -1))
	   			  array.set(i, oddCount);
	   			
	   		 }
	   		 else {
	   			 if(oddCount > 0){
		   			array.set(i-1, oddCount);
		   			oddCount = 0;
		   		 }
	   		 }
	   	 }
	   	for(int i =0; i < tempArray.size(); i++){
	   		array.remove((tempArray.get(i).intValue())-i);
	   	}
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
