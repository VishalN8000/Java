package Exceptions;
// Write a program to generate and handle ArrayIndexOutOfBound Exception using try catch.

import java.util.Scanner;

public class ArrayindexoutofBound {
	void method1()
	{
		Scanner scr=new Scanner(System.in);
		int array1[] =new int[5];
		System.out.println("enter the elements:");
		for(int i=0;i<=5;i++)
		{
			array1[i]=scr.nextInt();
		}
		System.out.println("elements entred are:");
		for(int i=0;i<=5;i++)
		{
			System.out.println("elements are;"+array1[i]);
		}
		try {
			System.out.println(array1[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled..");
		}
		

	}
	

}
