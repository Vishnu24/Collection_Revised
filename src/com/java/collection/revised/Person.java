
package com.java.collection.revised;

/**
 * @author Vishnu Garg
 * @created On Aug 2, 2018
 *
 */
class Person implements Comparable<Person> {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
    	System.out.println(" In Comapre To "+p.id+" current "+this.id);
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
