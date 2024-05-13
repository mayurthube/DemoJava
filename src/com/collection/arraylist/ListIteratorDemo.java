package com.collection.arraylist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * 
 * It supports bi-directional traversal. i.e both forward and backward direction.
 * It supports all the four CRUD operations(Create, Read, Update, Delete) operations.
 */
public class ListIteratorDemo {

	public static void main(String[] args) {

		// create a list of names
        List<String> names = new LinkedList<>();
        names.add("1");
        names.add("2");
        names.add("3");
  
        // Getting ListIterator
        ListIterator<String> namesIterator
            = names.listIterator();
  
        // Traversing elements
        while (namesIterator.hasNext()) {
        	String s =namesIterator.next();
        	if(s.equals("2"))
        	namesIterator.add("2_1");
            System.out.println(s);
        }
     // Traversing elements prev
        while (namesIterator.hasPrevious()) {
            System.out.println(namesIterator.previous());
        }
        
        /*for (String name : names) {
        	System.out.println(name);
		}*/
        
    }

	}


