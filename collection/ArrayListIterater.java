package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterater {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("people"); // list 1
		list.add("java");   // list 2
		list.add(0,"mouse");// list 3
		list.add(2,"monkey"); // list 4
		list.add("keypad");  // list 5
		list.add(5,"must be"); // list 6
		list.add(" cat");  // list 7
		list.add("dog"); // list 8
		list.add("rather"); // list 9
		
		System.out.println("Traversing using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing using for each loop");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("Traversing using for iterator");
		Iterator<String>itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Treaversing using iterator-backward");
		ListIterator<String> itr2 = list.listIterator(list.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
			
		}

	}

}
