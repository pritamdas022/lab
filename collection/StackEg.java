package collection;

import java.util.Stack;
// main class
public class StackEg {
// main method
	public static void main(String[] args) {
//		creating stack list
		Stack<Integer> sl = new Stack<>();
//		adding element(push)
		sl.add(35);
		sl.add(32);
		sl.add(31);
		sl.add(12);
		sl.add(45);
		sl.add(64);
//		checking empty or not
		boolean result = sl.empty();
		System.out.println("is the stack empty? : "+result);
		System.out.println(sl);
		Integer dig = sl.peek();// access element from the top of the stack
		System.out.println("top element : "+dig);
//		search any element
		int digit = sl.search(35);
		System.out.println("search element : "+digit);
//		find the size of the stack
		int x = sl.size();
		System.out.println("stack size : "+x);
//		checking empty or not
		result = sl.empty();
		System.out.println("is the stack empty? : "+result);
		

	}

}
