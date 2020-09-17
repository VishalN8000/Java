package Iteration;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int n;
		int a,b,c;
		a=0;
		b=1;
		System.out.println("enter the value of n");
		n=scr.nextInt();
		System.out.println(""+a);
		System.out.println(""+b);
		for(int i=0;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
		}

	}

}
