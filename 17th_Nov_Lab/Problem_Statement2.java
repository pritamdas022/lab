/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/
package LAB;

import java.util.ArrayList;
// main class
public class Problem_Statement2 {
//	creating array list 1
private ArrayList<Integer> list1 = new ArrayList<Integer>();
//	storeEvenNumbers method
	public ArrayList<Integer> storeEvenNumbers(int N) {
		list1 = new ArrayList<Integer>();
//		using iterator for loop 
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list1.add(i);// adding list1
		}
		
		return list1; // return
	}
	// printEvenNumbers method
	public ArrayList<Integer> printEvenNumbers() {
//		creating array list 2
		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		using iterator-for each method
		for (int item : list1) {
			list2.add(item * 2);// adding list 2
			System.out.println(item * 2);
		}
		
		return list2;  // return
	}
// main method
	public static void main(String[] args) {
//		creating class object
		Problem_Statement2 obj = new Problem_Statement2();
//		calling storeEvenNumbers method
		obj.storeEvenNumbers(100);
//		calling printEvenNumbers method
		obj.printEvenNumbers();
		

	}


}
