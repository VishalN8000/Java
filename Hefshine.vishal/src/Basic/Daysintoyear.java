package Basic;

public class Daysintoyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=373,year,week,day;
		year=days/365;
		week=days/365%7;
		day=days%365%7;
		 System.out.println("year is:"+year);
		 System.out.println("week is:"+week);
		 System.out.println("day is:"+day);
		 /*
		  * year=days/365;
		  * week=year%7;
		  * day=week%7;
		  * 
		  */

	}

}
