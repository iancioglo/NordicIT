package homeworkComparatorIterator;

public class NumberIteratorExample {
	
	public static void createAndPrintNumber(Integer number) {
		var numberIterator = new NumberIterator(number);
		System.out.println("Число : " + number);
		for (var n : numberIterator) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		createAndPrintNumber(0);
		createAndPrintNumber(1000);
		createAndPrintNumber(5005);
		createAndPrintNumber(123456789);
	}
}
