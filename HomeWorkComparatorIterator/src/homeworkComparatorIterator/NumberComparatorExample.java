package homeworkComparatorIterator;

import java.util.ArrayList;

public class NumberComparatorExample {

	public static void main(String[] args) {
		var ourN1 = new OurNumber(1);
		var ourN2 = new OurNumber(4);
		var ourN3 = new OurNumber(3);
		var ourN4 = new OurNumber(24);
		var ourN5 = new OurNumber(10);
		
		var list = new ArrayList<OurNumber>();
		list.add(ourN1);
		list.add(ourN2);
		list.add(ourN3);
		list.add(ourN4);
		list.add(ourN5);
		
		list.sort(new NumberComparator());
		
		for (var n : list) {
			System.out.println(n);
		}
	}
}
