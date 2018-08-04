/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.java.collection.revised;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author Vishnu Garg
 * @created On Aug 2, 2018
 *
 */
public class ArrayListExample {
	public static void main(String[] arg) throws Exception {
	    ArrayList<String> myList=new ArrayList<>();
	    System.out.println(myList.size());
	    System.out.println(findCapacity(myList));
	  
	    for(int i=0;i<30;i++){
	    	myList.add("Element"+i);
	    	 System.out.println(myList.size());
	 	    System.out.println(findCapacity(myList));
	    }
	    
		}
	static int findCapacity(ArrayList<String> al) throws Exception {
		 
        Field field = ArrayList.class.getDeclaredField("elementData");
 
        field.setAccessible(true);
 
        return ((Object[]) field.get(al)).length;
 
    }
 
}

