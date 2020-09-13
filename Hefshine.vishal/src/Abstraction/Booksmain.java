package Abstraction;

import java.util.Scanner;

public class Booksmain {

	public static void main(String[] args) {
		
		String name;String author;int price;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name:");
		name=sc.next();
		System.out.println("enter the author name:");
		author=sc.next();
		System.out.println("enter the price:");
		price=sc.nextInt();
		
		Book obj1=new Book(name,author,price);
		obj1.getName();
		obj1.getAuthor();
		obj1.getPrice();
		
		System.out.println("enter the name:"+obj1.getName());
		System.out.println("enter the author name:"+obj1.getAuthor());
		System.out.println("enter the price:"+obj1.getPrice());
		

	}

}
