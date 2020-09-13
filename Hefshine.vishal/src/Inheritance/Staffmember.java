package Inheritance;

import java.util.Scanner;

public class Staffmember extends Department {
	String Membername,Memberqualification;
	Scanner scr=new Scanner(System.in);
	Staffmember()
	{
		System.out.println("member name is:");
		Membername=scr.next();
		System.out.println("member qualification is:");
		Memberqualification=scr.next();
	}
	void Staffmemberdetail()
	{
		System.out.println("member name is:"+Membername);
		System.out.println("member qualification is:"+Memberqualification);
		
	}
	

}
