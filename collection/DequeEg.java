package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Arnab");
		dq.add("pritam");
		dq.add("Rohit");
		dq.add("Avik");
		dq.add("Mc squere");
		for (String s : dq) {
			System.out.println(s);
			dq.addFirst("Gopal");
			dq.addLast("omg");
			System.out.println("New List : ");
			for (String s1 : dq) {
				System.out.println(s1);
				
			}
			dq.removeFirst();
			dq.removeLast();
			System.out.println("new list after removal : ");
			for (String s2 : dq) {
				System.out.println(s2);
			}
		}

	}

}
