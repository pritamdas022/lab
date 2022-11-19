package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConvert {

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
		
//		converting of list to array
		System.out.println("List to Array");
		String [] arr = list.toArray(new String[list.size()]);
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println("Array to List : ");
		ArrayList<String> list1 = new ArrayList<String>();
		list1 = (ArrayList<String>) Arrays.asList(arr);
		System.out.println(list1);
		

	}

}
