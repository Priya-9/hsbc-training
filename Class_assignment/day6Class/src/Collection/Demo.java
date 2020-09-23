package Collection;

import java.util.HashSet;

public class Demo {
	public static void main(String args[]) {
		HashSet<Emp>hashset = new HashSet();
		Emp e1 = new Emp(101, "abc", "pune", 1000);
		Emp e2 = new Emp(102, "xyz", "pune1", 2000);
		Emp e3 = new Emp(103, "efg", "pune2", 3000);
		Emp e4 = new Emp(104, "rsq", "pun3", 4000);
		Emp e5 = new Emp(105, "uvw", "pune4", 5000);
		
		hashset.add(e1);
		hashset.add(e2);
		hashset.add(e3);
		hashset.add(e4);
		hashset.add(e5);
		
		System.out.println(hashset);
		System.out.println(hashset.contains(new Emp(102, "xyz", "pune1", 2000)));
		hashset.remove(new Emp(102, "xyz", "pune1", 2000));
		
		
	}
}
