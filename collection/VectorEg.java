package collection;

import java.util.Vector;
// main class
public class VectorEg {
// main method
	public static void main(String[] args) {
//		creating vector list
		Vector<String> vl = new Vector<>();
//		adding elements to vector
		vl.add("Rose");
		vl.add("Water Lily");
		vl.add("cherry blosom");
		vl.add("Dalhia");
		vl.add("sunflower");
		vl.add("Lotus");
//		checking size and capacity
		System.out.println("Size : "+vl.size());
		System.out.println("capacity : "+vl.capacity());
//		add more elements
		vl.addElement("Lily");
		vl.addElement("jasmin");
		System.out.println("After  adding elements : ");
		System.err.println("Size : "+vl.size());
		System.out.println("capasity : "+vl.capacity());
//		checking animal is present in the vector or not
		System.out.println(vl);
		if (vl.contains("animal")) {
			System.out.println("Element is present");
		}else {
			System.out.println("Elementis not present");
		}
		// getting 1st element
		System.out.println("First element : "+vl.firstElement());
//		getting last element
		System.out.println("Last element : "+vl.lastElement());
//		checking index of specified element
		System.out.println("Index : "+vl.indexOf("Lily"));

	}

}
