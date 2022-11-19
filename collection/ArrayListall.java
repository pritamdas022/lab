package collection;

import java.util.ArrayList;
import java.util.Collections;
// main class
public class ArrayListall {
// main method
	public static void main(String[] args) {
//		creating array list
		ArrayList<String> list = new ArrayList<String>();
//		adding elements
		list.add("rose"); // list 1
		list.add("Sunflower");// list 2
		list.add("jasmin");// list 3
		list.add("lotus");// list 4
		list.add("orchid");// list 5
		list.add("red rose");// list 6
		
		System.out.println("Normal list : "+list);
		Collections.sort(list);
		System.out.println("Array sort list : "+list);
		System.out.println(list.get(1));
		list.set(1, "white Rose");
		System.out.println("After set in list : "+list);

	}

}
