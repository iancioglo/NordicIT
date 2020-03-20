package com.zoo.animal;

public class Spider extends Animal implements Fadable, AbleToWeave {
	
	public Spider() {}
	
	public Spider(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void say() {
		System.out.println("<ужасающая тишина>");
	}

	@Override
	public void eat() {
		System.out.println("Паук-" + name + " съел насекомое");
	}
	
	@Override
	public void eat(int food) {
		System.out.println("Паук-" + name + " съел " + food + "грамм.");
	}
	
	@Override
	public void weaveAWeb() {
		System.out.println("Паук-" + name + " плетет паутину");
	}

	@Override
	public void fade() {
		System.out.println("Паук-" + name + " поменял шкурку");
	}
}
