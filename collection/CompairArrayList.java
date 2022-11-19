package collection;

import java.util.ArrayList;
import java.util.Collections;
// main class
public class CompairArrayList {
//	method
	public static boolean CompareList(ArrayList list2,ArrayList list3) {
		return list2.toString().contentEquals(list3.toString())?true:false;
	}
// main method
	public static void main(String[] args) {
//		creating arraylist
		ArrayList<String> list = new ArrayList<String>();
//		adding elements
		list.add("Apple");
		list.add("orange");
		list.add("mango");
		list.add("pineapple");
		list.add("banana");
		list.add("peanuts");
		list.add("dragon fruit");
//		creating another array list
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("rose");
		list.add("Sunflower");
		list.add("jasmin");
		list.add("lotus");
		list.add("orchid");
		list.add("red rose");
		
		System.out.println(CompareList(list,list1));
		Collections.reverse(list1);
		System.out.println(list1);
		System.out.println("Using compaire method :"+list.equals(list1));
		System.out.println("using remove all : "+list.removeAll(list1));
		System.out.println("using retain all : "+list.retainAll(list1));
		System.err.println("using ArrayList.contains : "+list.contains(list1));
		

	}

}
