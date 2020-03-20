package com.zoo;

import com.zoo.animal.Camel;
import com.zoo.animal.Hamster;
import com.zoo.exception.MoreWithoutWatherException;
import com.zoo.exception.TooMuchForCheeksException;

public class Zoo {

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
	}

}
