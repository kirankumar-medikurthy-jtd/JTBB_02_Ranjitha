//Write a program to check whether a given number is even or odd?

class findEvenOddNumber
{
	public static void main(String[] args)
	{
	//intiliazed the value
	
	int number = 122;
	
	//System.out.println(number);
	
	System.out.println(findEvenOddNumber(number));
	
	}
	
	
	public static boolean findEvenOddNumber(int number)
	{
	
		if(number % 2 == 0)
		{
		return true;
		}
		return false;
	}
}
