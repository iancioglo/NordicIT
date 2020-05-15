package homeworkComparatorIterator;

import java.util.Comparator;

public class NumberComparator implements Comparator<OurNumber>{

	@Override
	public int compare(OurNumber o1, OurNumber o2) {
		if (o1.getCountOfDiv() == o2.getCountOfDiv()) {
			return 0;
		} else if (o1.getCountOfDiv() > o2.getCountOfDiv()) {
			return 1;
		} else {
			return -1;
		}
	}

}
