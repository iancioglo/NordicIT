package com.zoo.animal;

public class Snake extends Animal implements Fadable, Poisonous {
	
	public Snake() {}
	
	public Snake(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void say() {
		System.out.println("шипение");
	}
	
	@Override
	public void eat() {
		System.out.println("Змея-" + name + " съела добычу.");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Змея-" + name + " съела " + food + " грамм.");
	}
	
	@Override
	public void usePoison() {
		System.out.println("Змея-" + name + " ужалила добычу.");
	}

	@Override
	public void fade() {
		System.out.println("Змея-" + name + " сменила кожу");
	}
}
