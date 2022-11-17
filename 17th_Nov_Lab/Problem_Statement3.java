// Write a Java program to extract a portion of an array list
package LAB;

import java.util.ArrayList;
import java.util.List;
// main class
public class Problem_Statement3 {
// main method
	public static void main(String[] args) {
//		try catch block
		try {
//			creating array list
			ArrayList<String> list = new ArrayList<>();
//			adding elements to the array list
			list.add("Red");
			list.add("Green");
			list.add("Orange");
			list.add("White");
			list.add("Black");
			
			System.out.println("original list : "+list);
//			using sublist method
			List<String> list1 = list.subList(0, 3);
//			printing sublist
			System.out.println("First three elements : "+list1);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
