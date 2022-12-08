// Write a Java program to replace an element in a linked list.
package LAB;

import java.util.ArrayList;

// main class
public class Problem_Statement5 {
// main method
	public static void main(String[] args) {
//		creating array list
		ArrayList<String> list = new ArrayList<>();
//		adding element to the array list
		list.add("Red");
		list.add("Green");
		list.add("White");
		list.add("Black");
		list.add("Pink");
		
		System.out.println("Original list : "+list);
//		using set method
		list.set(4, "Orange");
//		printing after replace list
		System.out.println("After replace the list : "+list);

	}

}
