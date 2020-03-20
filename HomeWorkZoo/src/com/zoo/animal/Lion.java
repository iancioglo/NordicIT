package com.zoo.animal;

public class Lion extends Animal implements Biting, Clawed {
	
	public Lion() {}
	
	public Lion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void say() {
		System.out.println("рычание");
	}
	
	@Override
	public void eat() {
		System.out.println("Лев-" + name + " кого-то съел.");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Лев-" + name + " съел" + food + " грамм.");
	}
	
	public void useClaws() {
		System.out.println("Лев-" + name + " - использовал когти.");
	}
	
	@Override
	public void bite() {
		System.out.println("Лев-" + name + " кусается.");
	}
}
