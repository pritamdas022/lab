package collection;

import java.util.Iterator;
import java.util.LinkedList;
// main class
public class LinkedListEg {
// main method
	public static void main(String[] args) {
//		creating linkedlist1
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Rose");
		ll.add("Water Lily");
		ll.add("cherry blosom");
		ll.add("Dalhia");
		ll.add("sunflower");
		ll.add("Lotus");
		
		System.out.println("After using add method :");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		// creating linkedlist2
		LinkedList<String> ll2= new LinkedList<>();
		
		ll2.add("Index size of Rose(4)");
		ll2.add("Index size of Water Lily(10)");
		ll2.add("Index size of cherry blosom(12)");
		ll2.add("Index size of cherry Dalhia(6)");
		ll2.add("Index size of sunflower(9)");
		ll2.add("Index size of Lotus(5)");
		
		System.out.println("----------------------------");
		System.out.println("After using addll method : "); 
		ll.addAll(ll2);
		Iterator<String> itr1 = ll.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println("------------------------------");
		System.out.println("After using addFirst method : ");
		ll2.addFirst("INDEX POSITION");
		Iterator<String> itr2 = ll2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
		System.out.println("------------------------------");
		System.out.println("After using addLast metod : ");
		ll.addLast("Ten flowers names are here ----------");
		Iterator<String> itr3= ll.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		
		}
		System.out.println("----------------------------");
		System.out.println("After using remove method : ");
		ll.remove(4);
		Iterator<String> itr4 = ll.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("-------------------------");
		System.out.println("After using remove all method : ");
		ll.removeAll(ll2);
		Iterator<String> itr5 = ll.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}
		System.out.println("--------------------------");
		System.out.println("After using removeFirst method : ");
		ll.removeFirst();
		Iterator<String> itr6 = ll.iterator();
		while (itr6.hasNext()) {
			System.out.println(itr6.next());
		}
		System.out.println("--------------------------");
		System.out.println("After using removeLast method : ");
		ll.removeLast();
		Iterator<String> itr7 = ll.iterator();
		while (itr7.hasNext()) {
			System.out.println(itr7.next());
		}
		System.out.println("---------------------------");
		System.out.println("After using removeFirstoccurence method : ");
		ll.removeFirstOccurrence(itr);
		Iterator<String> itr8 = ll.iterator();
		while (itr8.hasNext()) {
			System.out.println(itr8.next());
		}
		System.out.println("----------------------------");
		System.out.println("After using renoveLastoccurence method : ");
		ll2.removeLastOccurrence(itr3);
		Iterator<String> itr9 = ll.iterator();
		while (itr9.hasNext()) {
			System.out.println(itr9.next());
		}
		System.out.println("----------------------------");
		System.out.println("After using clear method : ");
		ll2.clear();
		System.out.println(" All elements  clear : "+ll2);
		

	}

}
