/* Write a program to print below pattern
*
*_ *
*_*_*
*_*_*_*
*/

class main
{
	public static void main(String[] ags)
	{
		int n = 5;
		
		for(int r = 1; r <= n; r++)
		{
			for(int c = 1; c <= r; c++)
			{
				if( c == r)
				{
				
					System.out.print("*");
				}
				else
				{
					System.out.print("*_");
					
				}
			
			}
			System.out.println();	
		
		}
	
	}

}


