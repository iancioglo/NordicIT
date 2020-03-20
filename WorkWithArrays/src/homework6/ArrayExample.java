package homework6;

import java.util.Scanner;

public class ArrayExample {
	// ищу нейтральное число
	static int neutral = 0;
	
	public static int findNeutralNumber(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == neutral) {
				neutral++;
				findNeutralNumber(array);
			}		
		}
		return neutral;
	}

	public static void main(String[] args) {
		var firstArray = new int[8];
		var secondArray = new int[8];
		var scanner = new Scanner(System.in);
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		var neutralNumber = findNeutralNumber(firstArray);	
		
		var count = 0;
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					count++;
					secondArray[j] = neutralNumber;
					break;
				}
			}
		}
		
		if (count == firstArray.length) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
