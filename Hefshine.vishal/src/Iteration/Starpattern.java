package Iteration;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a,b;
		System.out.println("enter the value of col:");
		a=scr.nextInt();
		System.out.println("enter  the value of row");
		b=scr.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
