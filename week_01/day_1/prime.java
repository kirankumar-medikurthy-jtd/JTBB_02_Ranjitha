//Write a program to check whether a given number is prime or not?
 class findOutPrimeOrNot
 {
 	public static void main(String[] args)
 	{
 	int number = 5;
 	//System.out.println(number);
 	System.out.println(findOutPrimeOrNot(number));
 	}
 	
 	
 	public static boolean findOutPrimeOrNot(int number)
 	{
 	//for counting 
 	
 	int count= 0;
 	
 		for(int i = 1; i<= number; i++)
 		{
 			//it checking 1 to infinity how many times the number divided
 			 
		 	if(number % i == 0)
		 	{
		 	count++;
		 	}
		 }			
		
		//number divided only 2 times it consider as a prime otherwise not prime 
		
		if(count == 2)
		 {
		 return true;
		 }
		return false;
		
		//return count;
	 }
 }
