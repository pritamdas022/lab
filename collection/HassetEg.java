package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// main class
public class HassetEg {
// main method
	public static void main(String[] args) {
//		creating Hashset and adding elements 
		Set<String> sl = new HashSet<>();
		sl.add("Arnab");
		sl.add("pritam");
		sl.add("Rohit");
		sl.add("Avik");
		sl.add("Mc squere");
		sl.add("wow :)");
		System.out.println("Original list : "+sl);
		// removing specific element from hash set
		sl.remove("Ram");
		System.out.println("After invoking remove : "+sl);
		HashSet<String> sl1 = new HashSet<>();
		sl1.add(null);
		sl1.add("hellp");
		System.out.println("Updated list : "+sl1);
		sl.addAll(sl1);
		System.out.println("Updated list : "+sl);
//		remove all the new elements
		sl.removeAll(sl1);
		sl.clear();
		System.out.println("Present list : "+sl);
		

	}

}
