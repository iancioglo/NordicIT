package com.zoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.zoo.animal.Animal;
import com.zoo.animal.Camel;
import com.zoo.animal.Hamster;
import com.zoo.exception.MoreWithoutWatherException;
import com.zoo.exception.TooMuchForCheeksException;
import com.zoo.exception.AviaryNotExistExeption;

public class Zoo {
	static HashMap<String, Set<Animal>> aviaries = new HashMap<String, Set<Animal>>();
	
	public static void goInAviary(String nameOfAviary, Animal animal) throws AviaryNotExistExeption {
		if (aviaries.containsKey(nameOfAviary)) {
			Set<Animal> set = aviaries.get(nameOfAviary);
			set.add(animal);
			aviaries.put(nameOfAviary, set);
		} else {
			throw new AviaryNotExistExeption("Такого вольера нет в нашем зоопарке.");
		}
	}

	public static void main(String[] args) {
		var hamster = new Hamster("Себастьян", 1);
		
		try {
			hamster.bigCheeks(25);
		} catch (TooMuchForCheeksException e) {
			System.out.println(e.getMessage());
		}
		
		var camel = new Camel();
		
		try {
			camel.noWater(15);
		} catch (MoreWithoutWatherException e) {
			System.out.println(e.getMessage());
		}
		
		// настроили вольеры
		var camels = new HashSet<Animal>();
		aviaries.put("Верблюды", camels);
		var lions = new HashSet<Animal>();
		aviaries.put("Львы", lions);
		var elephants = new HashSet<Animal>();
		aviaries.put("Слоны", elephants);
		
		// добавляем животных
		try {
			goInAviary("Верблюды", camel);
		} catch (AviaryNotExistExeption e) {
			System.out.println(e.getMessage());
		}
		
		try {
			goInAviary("Хомяки", hamster);
		} catch (AviaryNotExistExeption e) {
			System.out.println(e.getMessage());
		}
	}
}
