package com.day.animal.demo;

import com.day.animal.impl.Terrestrial;

public class Duck extends Animal implements Terrestrial{
	private int legNum =0;
	public Duck(String name,int legNum) {
		super(name);
		this.legNum =legNum;
	
	}

	@Override
	public void shout() {
		System.out.println("嘎嘎嘎。。。");
		
	}

	@Override
	public int getlegNum() {
		
		return legNum;
	}
	
}
