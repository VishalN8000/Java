package Abstraction;

import java.util.Scanner;

public class Book {
	private String name,author;
	private int price;
	Scanner scr =new Scanner(System.in);
	
	Book(String name,String author,int price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		System.out.println("book name is;"+this.name);
		System.out.println("author name is;"+this.name);
		System.out.println("the price is:"+this.price);
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public Scanner getScr() {
		return scr;
	}

}
