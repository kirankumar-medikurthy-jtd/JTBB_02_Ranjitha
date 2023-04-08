//Write a program to check whether a given number is positive or not?

class positiveNegativeNumber
{
	public static void main(String[] args)
	{
	
	//intialized the value here
		
	int number = -1234567;
	
	//System.out.println(number); for checking
	
	System.out.println(findPositiveNegative(number));
	
	
	}
	

	public static boolean findPositiveNegative(int number)
	{
		//any number more than 0 it has to be consider as a positive otherwise negative number
		
		if(number < 0)
		{
		return true;
		}
		return false;
	}


}
