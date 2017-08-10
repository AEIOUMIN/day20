package com.day.demo;

import java.util.ArrayList;
import java.util.List;

import com.bosic.demo.Dog;

public class Test1 {
	public static void main(String[] args) {
		//增加4各狗狗对象
		Dog a = new Dog("欧欧","雪娜瑞");
		Dog b = new Dog("美美","雪娜瑞");
		Dog c = new Dog("乐乐","雪娜瑞");
		Dog d = new Dog("丫丫","雪娜瑞");
		//将狗狗放到集合里
		List dogs = new ArrayList();
		dogs.add(a);
		dogs.add(b);
		dogs.add(c);
		dogs.add(1,d); //指狗狗定位置放置
		System.out.println("删除前狗狗"+dogs.size()+"数量");
		dogs.remove(2);//根据坐标删除
		dogs.remove(d);//根据对象
		System.out.println("删除后狗狗"+dogs.size()+"数量");
		//遍历集合显示狗狗
		for(int i=0;i<dogs.size();i++){
			Dog dog =(Dog) dogs.get(i);
			dog.print();
		}
		if(dogs.contains(d)){
			System.out.println("乐乐还在");
		}else{
			System.out.println("乐乐没了");
		}
	}
}
