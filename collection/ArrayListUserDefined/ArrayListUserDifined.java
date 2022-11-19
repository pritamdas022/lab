package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUserDifined {

	public static void main(String[] args) {
		Bank b1 = new Bank(2783668, "pritam", 20, 20000);
		Bank b2 = new Bank(2783668, "pritam", 20, 20000);
		Bank b3 = new Bank(2783668, "pritam", 20, 20000);
		Bank b4 = new Bank(2783668, "pritam", 20, 20000);
		Bank b5 = new Bank(2783668, "pritam", 20, 20000);
		
		ArrayList<Bank> list = new ArrayList<Bank>();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Bank obj = (Bank) itr.next();
			System.out.println(obj.accountNo+" "+obj.customName+""+obj.customerAge+" "+obj.balance);
		}
		





	}

}
