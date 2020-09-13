package Inheritance;

import java.util.Scanner;

public class Department {
	String departmentname,Hodname;
	Scanner src=new Scanner(System.in);
	Department()
	{
	System.out.println("enter the department name:");
	departmentname=src.next();
	System.out.println("enter hod name:");
	Hodname=src.next();
	
	}
	void DepartmentDetails()
	{
		System.out.println("the department name is:"+departmentname);
		
		System.out.println("hod name is:"+Hodname);
	}

}
