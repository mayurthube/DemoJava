package com.collection.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectionsMain {

	public static void main(String args[]) {
		Data data = new Data();
		List<String> tempStringList = new ArrayList<>();
		// ====Method binarySearch====
			System.out.println("\nMethod binarySearch : ");
			int index = Collections.binarySearch(data.intList, 13);
	       System.out.println(index);
	       System.out.println("------------------------------------------------------------");
	    // copy list
	       try {
		       System.out.println("\nMethod copy : ");
		       System.out.println("tempStringList isEmpty():"+tempStringList.isEmpty());
		       Collections.copy(tempStringList,data.stringList);
		       System.out.println("After copy tempStringList:"+tempStringList.toString());
	       } catch(Exception e) {
	    	   System.out.println(e);
	       }
	       System.out.println("------------------------------------------------------------");
	       
	       System.out.println("\nMethod disjoint : ");
	       String[] arr = { "Apple", "Cat","Cat","Loin"};
	       List<String> srtList= Arrays.asList(arr);
	       Collections.disjoint(data.stringList, srtList);
	       boolean flag = Collections.disjoint(data.stringList, srtList);
	       System.out.println("is disjoint:"+flag);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod enumeration : ");
		   
		   System.out.println("is enumeration:"+Collections.enumeration(data.stringList).nextElement());
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod fill : ");
		   System.out.println("Before fill :"+data.stringList);
		   Collections.fill(data.stringList,"Mayur");
		   System.out.println("After filled with :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod frequency : ");
		   System.out.println("srtList  :"+srtList);
		   Collections.frequency(srtList,"Mayur");
		   System.out.println("Frequency of Mayur :"+Collections.frequency(srtList,"Mayur"));
		   System.out.println("Frequency of Cat :"+Collections.frequency(srtList,"Cat"));
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod indexOfSubList and lastIndexOfSubList: ");
		   System.out.println("List  :"+data.intList);
		   int[] ints = {11,17,13};
		   List<Integer> tempIntList = Arrays.stream(ints).boxed().collect(Collectors.toList());
		   System.out.println("List to sub  :"+tempIntList);
		   int indexof = Collections.indexOfSubList(data.intList,tempIntList);
		   System.out.println("first index of sub string :"+indexof);
		   
		   int indexof1 = Collections.lastIndexOfSubList(data.intList,tempIntList);
		   System.out.println("last index of sub string :"+indexof1);
		   System.out.println("------------------------------------------------------------");
	        
		   
		   System.out.println("\nMethod max and min: ");
		   System.out.println("List  :"+data.intList);
		   System.out.println("max is :"+Collections.max(data.intList));
		   System.out.println("min is :"+Collections.min(data.intList));
		   
		   
		   System.out.println("List  :"+srtList);
		   System.out.println("max is :"+Collections.max(srtList, Comparator.comparing(s-> s.length())));
		   System.out.println("min is :"+Collections.min(srtList, Comparator.comparing(s-> s.length())));
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod replaceAll: ");
		   data = new Data();
		   System.out.println("List  :"+data.stringList);
		   System.out.println("replace List  :"+Collections.replaceAll(data.stringList, "Cat", "Bat"));
		   System.out.println("After replace List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod  reverse: ");
		   System.out.println("List  :"+data.stringList);
		   Collections.reverse(data.stringList);
		   System.out.println("After reverse List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod   	reverseOrder: ");
		   System.out.println("List  :"+data.stringList);
		   Collections.sort(data.stringList,Collections.reverseOrder());
		   System.out.println("After reverseOrder List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod   	rotate: ");
		   System.out.println("List  :"+data.stringList);
		   Collections.rotate(data.stringList,2);
		   System.out.println("After rotate	 List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod   	shuffle: ");
		   Collections.sort(data.stringList);
		   System.out.println("List  :"+data.stringList);
		   Collections.shuffle(data.stringList);
		   System.out.println("After shuffle	 List  :"+data.stringList);
		   Random random = new Random(); 
		   Collections.shuffle(data.stringList,random);
		   System.out.println("After Randomly  shuffle List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
		   
		   System.out.println("\nMethod   	swap: ");
		   System.out.println("List  :"+data.stringList);
		   Collections.swap(data.stringList,2,6);
		   System.out.println("After swap	 List  :"+data.stringList);
		   System.out.println("------------------------------------------------------------");
	}
	
	
	
	
}
