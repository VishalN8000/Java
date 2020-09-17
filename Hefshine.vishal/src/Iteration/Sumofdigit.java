package Iteration;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number:");
		num=scr.nextInt();
		int b,sum=0;
		while(num>0)
		{
			b=num%10;
			sum=sum+b;
			num=num/10;
	
		}
		System.out.println("sum is:"+sum);

	}

}
