package Controlstatement;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no");
		int x;
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		
	
		if(x%2 ==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}

	}

}
