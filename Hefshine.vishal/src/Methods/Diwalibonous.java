package Methods;

import java.util.Scanner;

public class Diwalibonous {
	public void input()
	{

		 Scanner scr = new Scanner(System.in);
		 System.out.println("enter the year of service");
		 int year = scr.nextInt();
		 System.out.println("enter the salary");
		 int sal=scr.nextInt();
		 calculation( sal, year);
	}

	public void calculation(int sal,int year)
	{

		if(year>=5)
		{

			int result =(sal*35)/100;
			int total =sal+result;

			System.out.println("total salary is"+total);

		}
		else 
		{

			int result= (sal*15)/100;
			int total =sal+result;
			System.out.println("total salary is"+total);
		}

	

	}

	}


