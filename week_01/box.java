//Write a program to print bellow pattern "box"
 
class main
{
	public static void main(String[] args)
	{
	int n = 4; 
	
		for(int i = 0; i <= n; i++)
		{
		String result = " ";
			for(int j =0 ; j <= n ; j ++)
			{
				if(i == 0 || j == 0 ||  i == n || j == n)
				{
					result+="*";
					
				}
				else
				{
				 	result+=" ";
				 	
				 }
			
			}
			System.out.println(result);	
			
		}
	
	}

}
