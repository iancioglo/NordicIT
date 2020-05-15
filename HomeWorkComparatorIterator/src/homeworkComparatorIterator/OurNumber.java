package homeworkComparatorIterator;

public class OurNumber {
	private int ourNumber; 
	private int countOfDiv = 0;
	
	public OurNumber(int ourNumber) {
		this.ourNumber = ourNumber;
		
		for (int i = 1; i <= ourNumber; i++) {
			if (ourNumber % i == 0) {
				countOfDiv++;
			}
		}
	}

	public int getOurNumber() {
		return ourNumber;
	}

	public void setOurNumber(int ourNumber) {
		this.ourNumber = ourNumber;
	}

	public int getCountOfDiv() {
		return countOfDiv;
	}

	public void setCountOfDiv(int countOfDiv) {
		this.countOfDiv = countOfDiv;
	}

	@Override
	public String toString() {
		return "OurNumber [ourNumber=" + ourNumber + ", countOfDiv=" + countOfDiv + "]";
	}
}
