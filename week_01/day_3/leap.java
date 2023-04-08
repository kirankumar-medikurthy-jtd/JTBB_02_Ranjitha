//Write a program to check if a given year is a leap year or not?

class leapYear
{
	public static void main(String[] args)
	{
	int year = 2003;
	System.out.println(leapYear(year));
	
	}
	
	public static boolean leapYear(int year)
	{
	boolean leapYear=false;
		if(year % 4 == 0)
		{
		leapYear = true;
		}
		return leapYear;
	}
}	
