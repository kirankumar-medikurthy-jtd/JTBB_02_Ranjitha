/*wo common ways of traversing a matrix are row-major-order and column-major-order. 
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output : Row-wise: 1 2 3 4 5 6 7 8 9
               Col-wise : 1 4 7 2 5 8 3 6 9
*/
/*
1.here we will checking two conditions
2.first one is row wise elements and column wise elemnts
3.normaly we will find out row wise element
4.second one here we changing the the colum rows arr[c][r] that's it



*/
class main
{
	public static void main(String[] args)
	{
	int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
	
	int row = 3;
	int col = 3;
	
		//rows wise;
			
		for(int r = 0; r < row; r++)
		{
			for(int c = 0; c < col; c++)
			{
			System.out.print(arr[r][c]+" ");
			
			}
		
		}
		
		
		
		
		
		for(int r = 0; r < row; r++)
		{
			for(int c = 0; c < col; c++)
			{
			System.out.print(arr[c][r]+" ");
			
			}
		
		}
		//column wise
		
		/*this is also work 
		for(int c = 0; c < col; c++)
		{
			for(int r = 0; r < row; r++)
			{
			System.out.print(arr[r][c]+" ");
			
			}
		
		}*/
	
	}

}
