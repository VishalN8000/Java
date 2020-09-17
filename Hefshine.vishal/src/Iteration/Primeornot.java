package Iteration;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the value of i");
		int num=scr.nextInt();
		boolean flag=false;
		int i;
		for(i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
			
	if(flag==true)

	{
		System.out.println(" it is not a prime no");
	}
	else
	{

		System.out.println(" it is prime no");
	}

	}
	}
