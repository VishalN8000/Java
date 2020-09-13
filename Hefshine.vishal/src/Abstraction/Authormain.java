package Abstraction;

import java.util.Scanner;

public class Authormain {

	public static void main(String[] args) {
		String authorname,place;
		int age;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the author name:");
		authorname=scr.next();
		System.out.println("enter the place:");
		place=scr.next();
		System.out.println("enter the age:");
		age=scr.nextInt();
		
		Author obj1=new Author(authorname,place,age);
		
		obj1.setAuthorname("Vishal");
		obj1.setPlace("Phaltan");
		obj1.setAge(22);

		System.out.println("enter the author name:"+obj1.getAuthorname());
		System.out.println("enter the place:"+obj1.getPlace());
		System.out.println("enter the age:"+obj1.getAge());

	}

}
