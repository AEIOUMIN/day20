package com.bosic.demo;

public class Penguin extends Pet{
	private String sex;
	
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
	@Override
	public void eat() {
		super.health=super.health+5;
		System.out.println("企鹅"+this.name+"吃饱了，健康值增加5");
		
	}
	public void print(){
		super.print();
		System.out.println("我的性别"+this.sex);
	}
}
