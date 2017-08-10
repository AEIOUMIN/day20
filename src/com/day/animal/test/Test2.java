package com.day.animal.test;

public class Test2 {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.start();
		while (test1.choose == 0) {
			try {
				test1.modify();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				test1.load();
				test1.choose = test1.input.nextInt();
			}
		}
		System.out.println("谢谢使用本系统!");
	}
}
