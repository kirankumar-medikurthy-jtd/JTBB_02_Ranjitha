//Day - 9
/*Write a program to print all odd length palindrome words present in a sentence.
Input : String = “madam speak malayalam fluently”
Output : madam, malayalam
*/

class main
{
	public static void main(String[] args)
	{
	String str ="madam speak malayalam fluently";
	//System.out.print(palindromeCheck(str));
	
		
		int prePoint = 0;
		int startPoint = 0;
		while(startPoint < str.length())
		{
			while(startPoint < str.length() && str.charAt(startPoint) != ' ')
			{
			startPoint++;
			}
			String temp = str.substring(prePoint,startPoint);		
			
				if(temp.length()%2 == 1 && palindromeCheck(temp))
				{
				System.out.print(temp+" ");
				}
			startPoint = startPoint+1;
			prePoint = startPoint;
			
		}
	
	
	}
	
	
	public static boolean palindromeCheck(String temp)
	{
		boolean flag = true;
		int startpoint = 0;
		int endpoint = temp.length()-1;
		
		while( endpoint > startpoint )
		{
			if(temp.charAt(startpoint) != temp.charAt(endpoint))
			{
			
			flag = false;
			
			endpoint--;			
			}
			break;
			
		}
		return flag;
		
	}
	
	
	//for reversing word
	
	public static void main(String str)
	{
		char[] arr = str.toCharArray();
		int startpoint = 0;
		int endpoint = arr.length-1;
		
		while(startpoint < endpoint)
		{
			char result = arr[startpoint];
			arr[startpoint] = arr[endpoint];
			arr[endpoint] = result;
			System.out.print(result);	
		}
		
	
	}
	
}
