package Exceptions;

import java.util.Scanner;

public class Runtimestack {
	void method1()
	{
		Scanner scr=new Scanner(System.in);
		 
		System.out.println("enter the num1:");
		int num1=scr.nextInt();
		System.out.println("enter the num2:");
		int num2=scr.nextInt();
		
		int result=0;
		result=num1/num2;
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		method2();
	}
	void method4()
	{
		method3();
	}
	
	
	

}
