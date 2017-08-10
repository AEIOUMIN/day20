package com.bosic.demo;

public abstract class Pet {
	protected String name;
	protected int health = 100;
	protected int love = 0;
	public Pet() {
	}
	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}

	public abstract void eat();
	public void print(){
		System.out.println("宠物的自白");
		System.out.println("我的名字是："+this.name+"我的健康值是："+this.health+"我与主人的亲密度是："+this.love);
	}

}
