/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.java.collection.revised;

import java.util.Hashtable;

/**
 * @author Vishnu Garg
 * @created On Aug 2, 2018
 *
 */
public class HashTableExample {
	  public static void main(String[]args)
	    {
		  Hashtable<String,String> ht = new Hashtable<String,String>();
	
	        //add key-value pair to hashtable
	        ht.put("first", "FIRST INSERTED");
	        ht.put("second", "SECOND INSERTED");
	        ht.put("third","THIRD INSERTED");
	        System.out.println(ht);
	        //getting value for the given key from hashtable
	        System.out.println("Value of key 'second': "+ht.get("second"));
	        System.out.println("Is Hashtable empty? "+ht.isEmpty());
	        ht.remove("third");
	        System.out.println(ht);
	        System.out.println("Size of the Hashtable: "+ht.size());
	    }
}

