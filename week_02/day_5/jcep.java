/*Write a program to print the array element in the pattern below?
            Example : input  : String str = “JCEP”
*/


class main
{
	public static void main(String[] args)
	{
		int arr [][] = { {1,2,3,4,5},{5,4,3,21,3},{22,3,34,44,5},{11,8,89,77,55},{2,33,45,67,38} };
		
		int rows = 5;
		int cols = 5;
		int rowmid = rows/2;
		int colmid = cols/2;
		
		// pattern pring  j letter
		
		System.out.print("***letter j ***");
		
		for(int c = 0 ; c < cols; c++)
		{
		
		System.out.print(arr[0][c]+" ");
		
		}
		
		for(int r = 0; r < rows; r++)
		{
		
		System.out.print(arr[r][colmid]+" ");
		
		} 
		
		for(int c = colmid; c >= 0; c--)
		{
		System.out.print(arr[rows-1][c]+" ");
		}
		
		
		//**********pattern c letter*****************
			 
			  System.out.println("**** letter c *****");
			 
			 for(int c = cols-1; c > 0; c--)
			 {
			 System.out.print(arr[0][c]+" ");
			 }
			 
			 
			 for(int r = 1 ;  r < rows-1; r++)
			 {
			 System.out.print(arr[r][0]+" ");
			 }
			 
			 for(int c = 1; c < cols; c++)
			 {
			 System.out.print(arr[rows-1][c]+" ");
			 }
			 
			
		
		
		//*********pattern e letter ********
		
		
			System.out.println("**** letter e *****");
			
			for(int c = cols-1; c > 0; c--)
			{
			System.out.print(arr[0][c]+" ");
			}
				 
				 
			for(int r = 1 ;  r < rows-1; r++)
			{
			System.out.print(arr[r][0]+" ");
			}
				 
			for(int c = 1; c < cols; c++)
			{
			System.out.print(arr[rows-1][c]+" ");
			}
				 
				 
			for(int c = 0; c < cols; c++)
			{
				 
			System.out.print(arr[rowmid][c]+" ");
			}
					
			
				 
		
		
		//*********pattern p letter ********
		
		System.out.println("**** letter p *****");
		
		for(int  r = 0; r < rows ; r++)
		{
		System.out.print(arr[r][0]+" ");
		}
		
		for(int c = 0; c <cols-1; c++)
		{
		
		System.out.print(arr[0][c]+" ");
		}
		
		for(int r = 0; r <= rowmid; r++)
		{
		System.out.print(arr[r][cols-1]+" ");
		}
		
		
		for(int c = cols-2; c >= 0; c--)
		{
		System.out.print(arr[rowmid][c]+" ");
		}
		
		
		
		
		
	
	}

}
