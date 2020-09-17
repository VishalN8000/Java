package Methods;

import java.util.Scanner;

public class Student {

		int rollno,totalmarks;
		long contactno;
		String name;
		Scanner scr = new Scanner(System.in);

		void inputstud() 
		{
			System.out.println("enter the roll no");
			 rollno=scr.nextInt();
			System.out.println("enter the name");
			 name =scr.next();
			System.out.println("enter the contact no");
			contactno=scr.nextLong();
			System.out.println("enter the total marks");
			totalmarks=scr.nextInt();



		}


		void displaystud()
		{
			System.out.println("the the roll no is"+rollno);
			System.out.println(" the name is "+name);
			System.out.println(" the contact no is"+contactno);
			System.out.println(" the total marks is"+totalmarks);


		}

	}


