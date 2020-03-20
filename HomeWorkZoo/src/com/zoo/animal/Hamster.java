package com.zoo.animal;

import com.zoo.exception.TooMuchForCheeksException;

public class Hamster extends Animal implements Thrifty, Cute {
	
	public Hamster() {}
	
	public Hamster(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void say() {
		System.out.println("писк");
	}
	
	@Override
	public void eat() {
		System.out.println("Хомяк-" + name + " съел семечку.");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Хомяк-" + name + " съел " + food + " грамм.");
	}
	
	@Override
	public void bigCheeks(int gramm) throws TooMuchForCheeksException {
		if (gramm > 20) {
			throw new TooMuchForCheeksException("Это всё не вместится в твои щёки, жадина!");
		} else {
			System.out.println("Хомяк-" + name + " запас " + gramm + " грамм еды.");
		}
	}
	
	@Override
	public void beCute() {
		System.out.println("Хомяк-" + name + " жутко милый!");
	}
}
