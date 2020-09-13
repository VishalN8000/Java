package Controlstatement;

import java.util.Scanner;

public class Negposzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("enter the no");
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		if(x>0)
		{
			System.out.println("no is positive");
		}
		 else if(x<0)
			{
				System.out.println("no is negative");
			}
		 else
		 {
			 System.out.println("no is neither positive or negative");
		 }
		}

	}


