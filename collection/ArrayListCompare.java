package collection;

import java.util.ArrayList;
// main class
public class ArrayListCompare {
// main method
	public static void main(String[] args) {
		//array list
		ArrayList<String> list = new ArrayList<String>();
//		adding list 1
		list.add("people"); // list 1
		list.add("java");   // list 2
		list.add(0,",mouse");// list 3
		list.add(2,"monkey"); // list 4
		list.add("keypad");  // list 5
		list.add(5,"must be"); // list 6
		list.add(" cat");  // list 7
		list.add("dog"); // list 8
		list.add("rather"); // list 9
		System.out.println(list);
		//array list 2
				ArrayList<String> list1 = new ArrayList<String>();
//				adding list
				list1.add("people"); // list 1
				list1.add("java");   // list 2
				list1.add(0,",mouse");// list 3
				list1.add(2,"monkey"); // list 4
				list1.add("keypad");  // list 5
				list1.add(5,"must be"); // list 6
				list1.add(" cat");  // list 7
				list1.add("dog"); // list 8
				list1.add("rather"); // list 9
				
				System.out.println(list1);
//				compare array list
				boolean b = list.equals(list1);
				System.out.println(b);
				list1.add("Rose"); // add new element
				System.out.println(list);
				System.out.println(list1);
				boolean b1 = list.equals(list1);
				System.out.println(b1);


	}

}
