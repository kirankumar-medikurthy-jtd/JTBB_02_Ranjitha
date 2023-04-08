//Write a program to check  whether a given number is an armstrong number or not
public class ArmstrongNumber {
	public static int number = 153;
        public static int temp = number;
	public static void main(String[] args)
        {
        System.out.println(counting(number));
        }
	public static boolean counting(int number)
	{
	int sum = 0;
        int count = 0;
		// count the number of digits
		//153 is not qual to 0
		
		while (temp != 0) 
		{
			//counting 3
			 
			count++;
			//it will do somthing each and evry elemnet in a number 
			
			temp /= 10;
		}

		temp = number;	

		// calculate the sum of digits raised to the power of count and replacing
		
		while (temp != 0) 
		{
		    int digit = temp % 10;
		    
		    //square
		    
		    sum += Math.pow(digit, count);
		    
		    temp /= 10;
		}


	// check if number is Armstrong number or not
	
		if (number == sum)
		{
		return true;
		}
		else
		{
		return false;
		}
		
        }
}

