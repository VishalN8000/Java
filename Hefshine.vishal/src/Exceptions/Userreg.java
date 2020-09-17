package Exceptions;

import java.util.Scanner;





public class Userreg {
	Scanner scr=new Scanner(System.in);
	String username,country;
	int age;
	void registerationprofile() throws InvalidCountryNameException, InvalidAgeException
	{
		System.out.println("enter the user name:");
		username=scr.next();
		System.out.println("enter the country:");
		country=scr.next();
		System.out.println("enter the age:");
		age=scr.nextInt();
		
		
		if(country.equalsIgnoreCase("india") ==false)
		{
			throw new InvalidCountryNameException("InvalidCountry");
		}
		else
		{
			System.out.println("Congrats.....user belongs to india");
		}
		
		
		if(age<18)
		{
			throw new InvalidAgeException("InvalidAge");
		}
		else
		{
			System.out.println("Hey...user is  above 18");
		}
		
	}

}
