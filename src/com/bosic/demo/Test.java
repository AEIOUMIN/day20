package com.bosic.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//创建四个狗狗对象
		Dog ououdog = new Dog("欧欧","雪娜瑞");
		Dog meimeidog = new Dog("美美","摩纳哥");
		Dog feifeidog = new Dog("菲菲","纽约");
		Dog yayadog = new Dog("丫丫","伦敦");
		//创建ArrayList集合对象把四个狗狗放入其中
		List dogs = new ArrayList();
		dogs.add(ououdog);
		dogs.add(feifeidog);
		dogs.add(0, yayadog);
		dogs.add(3, meimeidog);//meimeidog到指定位置
		//输出集合中狗狗的数量
		System.out.println("共有："+dogs.size()+"条狗狗");
		//通过遍历集合显示各狗狗的信息
		for(int i=0;i<dogs.size();i++){
			Dog dog =(Dog) dogs.get(i);		 
			dog.print();
		}
	}
}
