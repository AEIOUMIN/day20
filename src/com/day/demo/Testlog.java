package com.day.demo;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Testlog {
	private static final Logger logger = Logger.getLogger(Testlog.class);
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		try{
		System.out.print("请输入被除数：");
		int num1 = input.nextInt();
		System.out.print("请输入除数：");
		int num2 = input.nextInt();
		System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
		logger.info("正常信息输出："+String.format("%d / %d = %d", num1, num2, num1 / num2));
		}catch(Exception e){
			logger.error("异常信息",e);
		}finally{
			System.out.println("感谢使用本系统！");
		}
	}
}
