/*Write a program to print all the elements present in the matrix in “R” traversal.
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
                        Output: 1 4 7 2 3 6 5 9
*/

class main
{
	public static void main(String[] args)
	{
	int [][] arr ={ {1, 2, 3},{4, 5, 6},{7, 8, 9} };
	int col = 3;
	int colmid = col / 2;
	int row = 3;
	int rowmid = row / 2;
	
		//147
		for(int r = 0; r < row ; r++)
		{
			System.out.print(arr[r][0]+" ");
		
		}
		
		//23
		for(int c = colmid; c < col; c++)
		{
		System.out.print(arr[0][c]+" ");
		
		}
		//65
		
		for(int c = col-1; c >= colmid; c--)
		{
		System.out.print(arr[rowmid][c]+" ");
		
		}
		//9
		for(int r = 0; r < row; r++)
		{
			for(int c = 0; c < col; c++)
			{
				if(c == col-1 && r == row-1)
				{
				 System.out.print(arr[r][c]);
				 
				 }
				
			}
				
		}
	
	
	}
	
}
