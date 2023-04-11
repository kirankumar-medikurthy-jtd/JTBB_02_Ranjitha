//Write a program to count the number of even prime numbers and odd prime numbers present in range of 1 to N?
public class Main
{
    public static void main(String[] args)
    {
        int N = 100;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 2; i <= N; i++)
        {
            if (findOutPrime(i))
            {
                if (i % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        System.out.println( N + " is even count" + evenCount);
        System.out.println( N + " is odd count" + oddCount);
    }

    public static boolean findOutPrime(int n) 
    {
    	int count=0;
        for(int i = 1; i<=n; i++)
	 	{	
	 		if(n % i == 0)
	 		{
	 			count += 1;
	 		}	  
	   
	 	}
	 	if(count == 2)
	 	{
	  		return true;
	 	}else{
	 		return false;
	 	}
      	}

}
