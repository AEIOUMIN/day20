package com.day.animal.demo;

import com.day.animal.impl.Terrestrial;

public  class Cat extends Animal implements Terrestrial{
	private int legNum =0;
	public Cat(String name,int legNum) {
		super(name);
		this.legNum =legNum;
	}	

	@Override
	public void shout() {		
		//System.out.println(this.getName()+"\t\t"+getlegNum()+"\t\t"+"喵喵喵。。。");
		System.out.println("喵喵喵。。。");
	}
	@Override
	public int getlegNum() {
		
		return legNum;
	}
	
}
