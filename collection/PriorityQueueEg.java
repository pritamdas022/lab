package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Arnab");
		pq.add("pritam");
		pq.add("Rohit");
		pq.add("Avik");
		pq.add("Mc squere");
		System.out.println("Head : "+pq.element());
		System.out.println("Head : "+pq.peek());
		System.out.println("Iterating the element : ");
		Iterator itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing : ");
		Iterator<String> iter = pq.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
	

	}

}
