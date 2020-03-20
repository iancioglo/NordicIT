package com.hw4;

import java.util.Scanner;

public class Frame {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Введите высоту");
		var height = scanner.nextInt();
		System.out.println("Введите длину");
		var length = scanner.nextInt();
		System.out.println("Введите слово");
		var word = scanner.next();
		
		scanner.close();
		
		
		if ((word.length() + 2) > length || height < 3) {
			System.out.println("Ошибка!");
		} else {
			// ищем центр по высоте
			var center = height / 2;
			if (height % 2 == 0) {
				center--;
			}
			
			// ищем сколько пробелов должно быть между рамкой и словом
			var balanceL = (length - (word.length() + 2)) / 2;
			
			// нужно ли нам добавить ещё один пробел после слова
			var oneMoreSpace = (length - word.length() + 2) % 2 != 0;
			
			// отрисовка
			for (int i = 0; i < height; i++) {
				if (i == 0 || i == height - 1) {
					for (int j = 0; j < length; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else if (i == center) {
					System.out.print("*");
					for (int k = 0; k < balanceL; k++) {
						System.out.print(" ");
					}
					System.out.print(word);
					if (oneMoreSpace) {
						balanceL += 1;
					}
					for (int k = 0; k < balanceL; k++) {
						System.out.print(" ");
					}
					System.out.println("*");
				} else {
					System.out.print("*");
					for (int j = 0; j < length - 2; j++) {
						System.out.print(" ");
					}
					System.out.println("*");
				}
			}
		}
	}

}
