package com.zoo.animal;

public class Elephant extends Animal implements Trunked, Centenar {
	
	public Elephant() {}
	
	public Elephant(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void say() {
		System.out.println("трубление");
	}
	
	@Override
	public void eat() {
		System.out.println("Слон-" + name + " съел растение.");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Слон-" + name + " съел " + food + " грамм.");
	}
	
	@Override
	public void useTrunk() {
		System.out.println("Слон-" + name + " использует хобот.");
	}
	
	@Override
	public void liveLong() {
		System.out.println("Слон-" + name + " живёт очень долго.");
	}
}
