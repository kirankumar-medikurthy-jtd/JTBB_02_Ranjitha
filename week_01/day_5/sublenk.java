/*Write a program to print all the substrings of a string whose length is equal to K value?
Input : String  = “jtdfoundation”     K = 3;

*/

class main
{
	public static void main(String[]args)
	{
		String str="jtdfoundation";
		int m=12;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String substr="";
				for(int k=i;k<=j;k++)
				{
					substr+=str.charAt(k);
				}
				if(substr.length()==m)
				{
					System.out.println(substr);
				}
			
			}
		
		}
	
	
	}
}
