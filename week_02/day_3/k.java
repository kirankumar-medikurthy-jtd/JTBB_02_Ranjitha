/*Write a program to print all the element present in the matrix in “K” Traversal 
          Input : mat[][] = {{1, 2, 3}, 
                                       {4, 5, 6}, 
                                        {7, 8, 9}}
Output : 1 4 7 3 5 9
*/

class main
{
	public static void main(String[] args)
	{
	int[][] arr = { {1, 2, 3},{4, 5, 6},{7, 8, 9} };
	int row = 3;
	int col = 3;
	int rowmid = row/2;
	int colmid = col/2;
	
		
		for(int r = 0; r < row; r++)
		{
		System.out.print(arr[r][0]+" ");
		
		} 
		
		for(int r = 0; r < rowmid; r++)
		{
			for(int c = col-1; c > colmid; c--)
			{
			System.out.print(arr[r][c]+" ");
			
			}
				
		}
		 
		for(int r = 1; r < row; r++)
		{
			for(int c = 1; c < col; c++)
			{
			
				System.out.print(arr[r++][c]+" ");
				
			}
		}
			
	}

}
