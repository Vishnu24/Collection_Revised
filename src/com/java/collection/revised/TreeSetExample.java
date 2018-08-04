
package com.java.collection.revised;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Vishnu Garg
 * @created On Aug 2, 2018
 *
 */
public class TreeSetExample {

	public static void main(String[] arg) {
    // basicTreset();
	//	withComparable();
		withCompartor();
	}

	private static void withComparable() {
		SortedSet<Person> sortedSet = new TreeSet<>();
		
		sortedSet.add(new Person(1, "Mark"));
		
		sortedSet.add(new Person(3, "Harmony"));
		sortedSet.forEach(System.out::println);
	}

	private static void setWithList() {
		List<Person> listOfPerson = Arrays.asList(new Person(1, "Mark"), new Person(2, "Vispi"), new Person(3, "Harmony"));
		SortedSet<Person> sortedSetFromCollection = new TreeSet<>(listOfPerson);
		SortedSet<Person> copiedSet = new TreeSet<>(sortedSetFromCollection);
		copiedSet.forEach(System.out::println);
	}

	private static void withCompartor() {
		SortedSet<Person> sortedSet = new TreeSet<>();
		sortedSet.add(new Person(1, "Mark"));
		sortedSet.add(new Person(2, "Vispi"));
		sortedSet.add(new Person(3, "Harmony"));
         //Asending Order id
		SortedSet<Person> customOrderedSet = new TreeSet<>((p1, p2) -> p1.id - p2.id);
		
		//Descending Order by id
		//SortedSet<Person> customOrderedSet = new TreeSet<>((p1, p2) -> p2.id - p1.id);
		
		customOrderedSet.addAll(sortedSet);
		customOrderedSet.forEach(System.out::println);
	}

	private static void basicTreset() {
		SortedSet<Integer> setWithNaturalOrdering = new TreeSet<>();
		setWithNaturalOrdering.add(5);
		setWithNaturalOrdering.add(9);
		setWithNaturalOrdering.add(4);
		setWithNaturalOrdering.add(2);
		setWithNaturalOrdering.forEach(System.out::println);
	}
}
