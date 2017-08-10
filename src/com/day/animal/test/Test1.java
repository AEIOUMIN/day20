package com.day.animal.test;

import java.util.Scanner;

import com.day.animal.demo.Animal;
import com.day.animal.demo.Cat;
import com.day.animal.demo.Dolphin;
import com.day.animal.demo.Duck;
import com.day.animal.impl.Terrestrial;

public class Test1 {
	// 声明静态数组
	Animal[] animals = new Animal[3];
	Scanner input = new Scanner(System.in);
	int choose;

	// 数组初始化
	public void start() {
		Terrestrial t = new Cat("加菲猫", 4);
		Animal a = (Animal) t;
		Terrestrial t1 = (Terrestrial) a;

		animals[0] = new Cat("加菲猫", 4);
		animals[1] = new Duck("唐老鸭", 2);
		animals[2] = new Dolphin("海豚琪琪");
		// 显示初始化数组
		load();
		choose = input.nextInt();
	}

	public void load() {
		System.out.println("动物名字\t\t腿的条数\t\t动物叫");
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Terrestrial) {
				String name = animals[i].getName();
				int legNum = ((Terrestrial) animals[i]).getlegNum();
				System.out.print(name + "\t\t" + legNum + "\t\t");
				animals[i].shout();
			} else {
				String name = animals[i].getName();
				System.out.print(name + "\t\t" + 0 + "\t\t");
				animals[i].shout();
			}
		}
		System.out.println("可以输入0修改动物的信息，输入其他退出");
	}

	public void modify() throws Exception {
		String[] name = new String[3];
		int[] number = new int[3];
		System.out.println("请输入猫的名字：");
		name[0] = input.next();
		System.out.println("请输入猫腿的数量：");
		number[0] = input.nextInt();
		if (number[0] != 4) {

			throw new Exception("猫猫的腿只能是4条腿");

		}
		System.out.println("请输入鸭子的名字：");
		name[1] = input.next();
		System.out.println("请输入鸭子腿的数量：");
		number[1] = input.nextInt();
		if (number[1] != 2) {

			throw new Exception("鸭子的腿只能是2条腿");

		}
		System.out.println("请输入海豚的名字：");
		name[2] = input.next();
		animals[0] = new Cat(name[0], number[0]);
		animals[1] = new Duck(name[1], number[1]);
		animals[2] = new Dolphin(name[2]);
	}
}
