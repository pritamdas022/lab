package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(101, "Mango");
		map1.put(102, "Orange");
		map1.put(106, "Banana");
		map1.put(107, null);
		map1.put(null, "Apple");
		map1.putIfAbsent(102, "custardApple");
		map1.putIfAbsent(101, "Watermalon");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map1.remove(102);
		System.out.println("After removal : ");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
