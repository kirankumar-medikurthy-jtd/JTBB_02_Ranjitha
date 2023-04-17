/*Write a program to print odd length and longest  palindromic substring from the string (Fouziya)
            Example: String str = “babad”*/

public class main
{
	public static void main(String[] args)
	{
		String str = "babad";
		//largest substring
		 String LargestSubstring = str.charAt(0) + " " ;
		 //run the loop
			for(int j = 0; j < str.length(); j++)
			{
				for(int f = j+1; f <= str.length(); f++)
				{
					String substr=str.substring(j,f);//print the i,j
					//call the function and check the odd or even length and also the largestsubstring length
					if(findPalindrom(substr) && substr.length()%2==1 && substr.length() >= LargestSubstring.length())
					{
						System.out.println(substr);
						LargestSubstring = substr;
					}
				}
			}
		
	}
	//check palindrome or not
	public static boolean findPalindrom(String str)
	{
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				flag =  false;
			}	
			start++;
			end--;
		}
		return flag;
		
		
	}
}
