package lesson2103;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class WordAndWords {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var word = scanner.nextLine();
		
		var letters = new HashSet<Character>();
		var wordHistory = new HashSet<String>();
		
		var mapWithAlphabet = new HashMap<String, Integer>(Map.of("а", 10, "б", 3, "в", 5, "г", 3, 
				"д", 5, "е", 9, "ж", 2, "з", 2, "и", 10, "й", 4));
		mapWithAlphabet.put("к", 6);
		mapWithAlphabet.put("л", 4);
		mapWithAlphabet.put("м", 5);
		mapWithAlphabet.put("н", 8);
		mapWithAlphabet.put("о", 10);
		mapWithAlphabet.put("п", 6);
		mapWithAlphabet.put("р", 6);
		mapWithAlphabet.put("с", 6);
		mapWithAlphabet.put("т", 5);
		mapWithAlphabet.put("у", 3);
		mapWithAlphabet.put("ф", 10);
		mapWithAlphabet.put("х", 2);
		mapWithAlphabet.put("ц", 1);
		mapWithAlphabet.put("ч", 2);
		mapWithAlphabet.put("ш", 2);
		mapWithAlphabet.put("щ", 1);
		mapWithAlphabet.put("ъ", 1);
		mapWithAlphabet.put("ы", 2);
		mapWithAlphabet.put("ь", 2);
		mapWithAlphabet.put("э", 1);
		mapWithAlphabet.put("ю", 1);
		mapWithAlphabet.put("я", 4);

		var firstGamer = 0;
		var secondGamer = 0;
		var countGamers = 1;
		
		
		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}
		
		var countOfEmpty = 0;
		while (countOfEmpty < 2) {
			var newWord = scanner.nextLine();
			if (newWord.isEmpty()) {
				countOfEmpty++;
				countGamers++;
			} else {
				if (countOfEmpty == 1) {
					countOfEmpty--;
					countGamers++;
				}
				var count = 0;
				for (int i = 0; i < newWord.length(); i++) {
					if (letters.contains(newWord.charAt(i))) {
						count++;
					}
				}
				if (count == newWord.length() && !wordHistory.contains(newWord)) {
					wordHistory.add(newWord);
					System.out.println("Ваше слово принято");
					
					// считаем сколько баллов за слово
					char[] wordForScore = newWord.toCharArray();
					for (char c : wordForScore) {
						if (countGamers % 2 == 0) {
							secondGamer += mapWithAlphabet.get(Character.toString(c));
						} else {
							firstGamer += mapWithAlphabet.get(Character.toString(c));
						}						
					}
					countGamers++;
				} else if (wordHistory.contains(newWord)) {
					System.out.println("Такое слово уже есть! Введите другое");
				} else {
					System.out.println("Не все буквы из базового слова! Введите дуругое");
				}
			}	
		}
		scanner.close();
		System.out.println("первый игрок заработал " + firstGamer + " очков");
		System.out.println("второй игрок заработал " + secondGamer + " очков");
	}
}
