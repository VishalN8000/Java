package Methods;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner scr =new Scanner(System.in);
			Calculator obj1=new Calculator();
			System.out.println("1.addtion");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");


			System.out.println("enter the operation u want to perform");
			int option=scr.nextInt();


			switch(option)

			{
			case 1: System.out.println("enter the two numbers");
			int num1=scr.nextInt();
			int num2=scr.nextInt();

			double addresult=obj1.addition(num1, num2);
			System.out.println("the addtion is="+addresult);

			break;


			case 2: System.out.println("enter the two numbers");
			 num1=scr.nextInt();
			 num2=scr.nextInt();
			 double subresult=obj1.subtraction(num1, num2);
			 System.out.println("the subtraction is="+subresult);

			break;



			case 3: System.out.println("enter the two numbers");
			 num1=scr.nextInt();
			 num2=scr.nextInt();

		double   mulresult=obj1.multiplication(num1, num2);
		System.out.println("the multiplication is="+mulresult);
			break;


			case 4: System.out.println("enter the two numbers");
			 num1=scr.nextInt();
			 num2=scr.nextInt();

			 double divresult=obj1.division(num1, num2);
			 System.out.println("the division is="+divresult);
			break;



			}



		}
}


