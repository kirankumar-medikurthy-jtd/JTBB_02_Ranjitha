/*Write a program to print indices of 2 elements in an array, Whose difference is equal to target value
Input : [1,8,2,3,9,4,5];
Output : 2 4
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
