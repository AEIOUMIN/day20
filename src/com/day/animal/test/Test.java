package com.day.animal.test;

import java.util.Scanner;

import com.day.animal.demo.Animal;
import com.day.animal.demo.Cat;
import com.day.animal.demo.Dolphin;
import com.day.animal.demo.Duck;
import com.day.animal.impl.Terrestrial;

public class Test {	
	//定义数组
	static Animal[] animals = new Animal[3];
	static Scanner input =new Scanner(System.in);
	static int  choose;
	//初始化信息
	public static void start(){
		Animal a1=new Cat("加菲猫",4);
		animals[1] = new Duck("唐老鸭",2);
		animals[2] = new Dolphin("海豚奇奇");
		load();
		choose =input.nextInt();
	}
	public static void main(String[] args) {
		start();
		while(choose==0){
			try{
				modify();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				load();
				choose=input.nextInt();
			}
		}
	}
	public static void load(){
		System.out.println("动物名字\t\t腿的条数\t\t动物叫");
		for(int i=0;i<animals.length;i++){
			if(animals[i] instanceof Terrestrial){
				String name=animals[i].getName();
				int legNum =((Terrestrial)animals[i]).getlegNum();
				System.out.print(name+"\t\t"+legNum+"\t\t");
				animals[i].shout();
			}else{
				String name= animals[i].getName();
				System.out.print(name+"\t\t"+0+"\t\t");
				animals[i].shout();
			}
			
		}
		System.out.println("是否继续修改数据：按0进行修改操作，其他任意数字键退出");
	}
	public static void modify() throws Exception{
		String[] names = new String[3];
		int[] number =new int[3];
		System.out.println("请输入猫的名字：");
		names[0]=input.next();
		System.out.println("请输入猫腿的数量：");
		number[0]=input.nextInt();
		if(number[0]!=4){
			throw new Exception("猫只能有四条腿");
		}
		System.out.println("请输入鸭子的名字：");
		names[1]=input.next();
		System.out.println("请输入鸭腿的数量：");
		number[1]=input.nextInt();
		if(number[1]!=2){
			throw new Exception("鸭子只能有两条腿");
		}
		System.out.println("请输入海豚的名字：");
		names[2]=input.next();
		animals[0]=new Cat(names[0],number[0]);
		animals[1]=new Duck(names[1],number[1]);
		animals[2]=new Dolphin(names[2]);
	}
}
 