package Iteration;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the value of i:");
		num=scr.nextInt();
		int i,fact=1;
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);

	}

}
