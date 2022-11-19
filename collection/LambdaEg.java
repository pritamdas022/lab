package collection;

import java.util.ArrayList;
// main class
public class LambdaEg {
// main method
	public static void main(String[] args) {
//		creating arraylist
		ArrayList<Integer> al = new ArrayList<>();
//		adding elements
		al.add(78);
		al.add(76);
		al.add(43);
//		using lambda function
		al.forEach((a)->{System.out.println(a);});

	}

}
