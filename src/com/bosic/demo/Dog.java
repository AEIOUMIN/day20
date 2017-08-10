package com.bosic.demo;

public class Dog extends Pet{
	private String strain;
	
	public Dog(String name,String strain) {
		super(name);
		this.strain = strain;
	}
	
	public String getStrain() {
		return strain;
	}
	public void print(){
		super.print();
		System.out.println("我是一只"+this.strain);
	}

	@Override
	public void eat() {
			super.health=super.health+3;
			System.out.println("狗狗"+this.name+"吃饱了，健康值增加3");
		
	}
	
}
