// Write a Java program to insert the specified element at the front of a linked list.
package LAB;

import java.util.LinkedList;
// main class
public class Problem_Statement5 {
// main method
	public static void main(String[] args) {
//		creating array list
		LinkedList<String> ll = new LinkedList<>();
//		adding elements in the array list
		ll.add("Red");
		ll.add("Green");
		ll.add("White");
		ll.add("Black");
		ll.add("Pink");
		
		System.out.println("Original list : "+ll);
//		using addFirst method
		ll.addFirst("Blue");
			System.out.println("After insert elemnt to front of the list : "+ll);
		

	}

}
