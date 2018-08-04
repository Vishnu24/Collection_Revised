
package com.java.collection.revised;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Vishnu Garg
 * @created On Aug 1, 2018
 *
 */
public class HashSetExample {
	  public static void main(String[]args)
	    {
	        HashSet<String> h = new HashSet<String>();
	 
	        System.out.println(h.size());
	        
	        // Adding elements into HashSet usind add()
	        h.add("India");
	        h.add("Australia");
	        h.add("South Africa");
	        h.add("India");// adding duplicate elements
	 
	        // Displaying the HashSet
	        System.out.println(h);
	        System.out.println("List contains India or not:" +
	                           h.contains("India"));
	 
	        // Removing items from HashSet using remove()
	        h.remove("Australia");
	        System.out.println("List after removing Australia:"+h);
	 
	        // Iterating over hash set items
	        System.out.println("Iterating over list:");
	        Iterator<String> i = h.iterator();
	        while (i.hasNext())
	            System.out.println(i.next());
	    }
}

