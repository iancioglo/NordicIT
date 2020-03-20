package com.hwthree;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		var needInput = true;
		var operation = "";
		var number = 0;
		var numberOrExponent = 0;
		var scanner = new Scanner(System.in);	
		
		while (needInput) {
			operation = scanner.next();
			
			if ("+".equals(operation) || "-".equals(operation) || 
					"*".equals(operation) || "/".equals(operation) ||
					"div".equals(operation) || "mod".equals(operation) ||
					"^".equals(operation)) {
				needInput = false;
			} else {
				System.out.println("Недопустимая операция!");
			}
		}
		
		number = scanner.nextInt();
		numberOrExponent = scanner.nextInt();
		scanner.close();
		
		switch (operation) {
		case "+": {
			System.out.print("Сумма чисел = " + (number + numberOrExponent));
			break;
		} 
		case "-": {
			System.out.print("Разность чисел = " + (number - numberOrExponent));
			break;
		}
		case "*": {
			System.out.print("Результат умножения чисел = " + (number * numberOrExponent));
			break;
		}
		case "/": {
			if (numberOrExponent == 0) {
				System.out.println("На ноль делить запрещено!");
			} else {
				System.out.print("Резульат деления чисел = " + ((number * 1.0) / numberOrExponent));
			}
			break;
		} 
		case "div": {
			if (numberOrExponent == 0) {
				System.out.println("На ноль делить запрещено!");
			} else {
				System.out.print("Резульат целочисленного деления чисел = " + (number / numberOrExponent));
			}
			break;
		}
		case "mod": {
			if (numberOrExponent == 0) {
				System.out.println("На ноль делить запрещено!");
			} else {
				System.out.print("Остаток от деления чисел = " + (number % numberOrExponent));
			}
			break;
		}
		case "^": {
			if (numberOrExponent == 0) {
				System.out.print("Резульат возведения в степень = 1");
			} else if (numberOrExponent > 0) {
				number = inExponent(number, numberOrExponent);
				System.out.print("Резульат возведения в степень = " + number);
			} else {
				numberOrExponent = numberOrExponent * (-1);
				number = inExponent(number, numberOrExponent);
				System.out.print("Резульат возведения в степень = " + (1.0 / number));
			}
			break;
		}
		}
	}
	
	private static int inExponent(int number, int numberOrExponent) {
		var result = number;
		for (int i = 0; i < numberOrExponent - 1; i++) {
			result *= number;
		}
		return result;
	}
	
}
