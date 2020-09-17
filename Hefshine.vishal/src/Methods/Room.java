package Methods;

import java.util.Scanner;

public class Room {
	int length,width,height;
	float area;
	Scanner scr =new Scanner(System.in);

	 void input()
	{
		System.out.println("enter the length");
		 length=scr.nextInt();
		System.out.println("enter the width");
		 width=scr.nextInt();
		System.out.println("enter the height");
		 height=scr.nextInt();



	}

	float whiteWashingArea()

	{

		 area=length*width*height;
		return area;

	}
	int whiteWashingcost()
	{

		int cost=(int) (area*80);
		return cost;



	}
	int flooringcost()
	{

		System.out.println("1.geometric flooring");
		System.out.println("2.cement flooring");
		System.out.println(" select the flooring type");
		int option=scr.nextInt();


		if(option==1)
		{

			int  flooringcost=(int) (area*200);
			return flooringcost;

		}
		else
		{

			int  flooringcost=(int) (area*100);
			return flooringcost;

		}



		}


	}


