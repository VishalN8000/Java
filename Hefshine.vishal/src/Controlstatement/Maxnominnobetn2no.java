package Controlstatement;

import java.util.Scanner;

public class Maxnominnobetn2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no a");
		a=scr.nextInt();
		System.out.println("enter the no b");
		b=scr.nextInt();
		if(a>b)
		{
			System.out.println("a is max than b");
		}
		else
		{
			System.out.println("a is min than b");
		}

	}

}
