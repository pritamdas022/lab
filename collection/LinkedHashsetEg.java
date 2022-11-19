package collection;
// linkedhashset inherit the hashset class & implements the set interface
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
// main class
public class LinkedHashsetEg {
// main method
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		s.add("Pen");
		s.add("Pencil");
		s.add("MOuse");
		s.add("ABC");
		s.add(null);// allowing null method
		s.add("Bottle");
		s.add("earphone");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
