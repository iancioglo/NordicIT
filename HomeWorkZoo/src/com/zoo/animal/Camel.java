package com.zoo.animal;

import com.zoo.exception.MoreWithoutWatherException;

public class Camel extends Animal implements Deserted, Waterless {
	
	public Camel() {}
	
	public Camel(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void say() {
		System.out.println("урчание");
	}
	
	@Override
	public void eat() {
		System.out.println("Верблюд-" + name + " съел колючку.");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Верблюд-" + name + " съел " + food + " грамм.");
	}
	
	@Override
	public void noWater(int day) throws MoreWithoutWatherException {
		if (day > 14) {
			throw new MoreWithoutWatherException("Верблюд слишком долго без воды!");
		} else {
			System.out.println("Верблюд-" + name + " обходится без воды " + day + " дней.");
		}
	}
	
	@Override
	public void desertLive() {
		System.out.println("Верблюд-" + name + " отлично выживает в пустыне.");
	}
}
