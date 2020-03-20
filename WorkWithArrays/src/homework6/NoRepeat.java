package homework6;

import java.util.Scanner;

public class NoRepeat {
	// заменяем все повторы на 0
	static int[] deleteRepeat(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					array[j] = 0;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var array = new int[9];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		var newArray = deleteRepeat(array);
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

}
