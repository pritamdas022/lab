// Write a Java program to compare two array lists.
package LAB;

import java.util.ArrayList;
import java.util.Arrays;
// main class
public class Problem_Statement3 {
// main method
	public static void main(String[] args) {
//		creating first array list
		ArrayList<String> list = new ArrayList<>();
//		adding elements to the first array list
		list.add("Red");
		list.add("Green");
		list.add("White");
		list.add("Black");
		list.add("Pink");
//		using set method
		Arrays.asList(list);
//		creating second array list
		ArrayList<String> list1 = new ArrayList<>();
//		adding elements to the second array list
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("Pink");
//		using set method
		Arrays.asList(list1);
//		creating third array list
		ArrayList<String> list2 = new ArrayList<>();
//		iterator using for-each loop
		for (String string : list) {
			list2.add(list1.contains(string)?"Yes":"No");
		}

		System.out.println(list2);
		

	}

}
