package collection;

import java.util.ArrayList;
// main class
public class ArrayListEx {
// main method 
	public static void main(String[] args) {
//		array list
		ArrayList<String> list = new ArrayList<String>();
//		adding list
		list.add("people"); // list 1
		list.add("java");   // list 2
		list.add(0,",mouse");// list 3
		list.add(2,"monkey"); // list 4
		list.add("keypad");  // list 5
		list.add(5,"must be"); // list 6
		list.add(" cat");  // list 7
		list.add("dog"); // list 8
		list.add("rather"); // list 9
//		printing lists
		System.out.println(list);
		System.out.println("Array list length : "+list.size());
		System.out.println("element of index value is : "+list.get(1));
		System.out.println("Remove list :"+list.remove(1)+",After remove lists"+list+", After removing Array list length : "+list.size());
		
	}

}
