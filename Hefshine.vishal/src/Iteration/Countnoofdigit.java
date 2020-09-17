package Iteration;

import java.util.Scanner;

public class Countnoofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no is:");
		num=scr.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("no of digit is:"+count);

	}

}
