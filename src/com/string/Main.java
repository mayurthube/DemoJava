package com.string;

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
    	 boolean condition1, condition2;
    	 Integer tempInt;
    	 for(int i =0; i < array.size(); i++){
    		 condition1 = false;
    		 condition2 = false;
    		 tempInt = array.get(i);
    		 if(tempInt % 3 == 0)
    			 condition1 = true;
    		 if(tempInt % 10 == 3)
    			 condition2 = true;
    		 if(condition1 && condition2){
    			 array.set(i, -3);
    		 }
    		 else if(condition1 == true && condition2 == false){
    			 array.set(i, -1);
    		 }
    		 else if(condition1 == false && condition2 == true){
    			 array.set(i, -2);
    		 }
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
        int new_length = Main.processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
        
        //Main main = new Main();
       // main.myMethod("gfg","fgfdg","gfdgfd");
    }
    
    public void myMethod(String... strings){
        for(String whatever : strings){
        	System.out.println(whatever);
        }

        
    }
}
