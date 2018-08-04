/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.java.collection.revised;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Vishnu Garg
 * @created On Aug 2, 2018
 *
 */
public class TreeMapExample {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");
		System.out.println(map);
		map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return (x > y) ? -1 : ((x == y) ? 0 : 1);
			}

		});
		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");
		System.out.println(map);

	}

}
