package Iteration;

import java.util.Scanner;

public class Calpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,power,result=1,i;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no");
		number=scr.nextInt();
		System.out.println("enter the power");
		power=scr.nextInt();
		for(i=1; i <= power;i++)
		{
			result=result*number;
		}
		System.out.println("result is:"+result);
		

	}

}
