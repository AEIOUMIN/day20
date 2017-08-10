package com.day.animal.demo;

public abstract class Animal {
	private String name="无名";
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	
	public abstract void shout();
}
