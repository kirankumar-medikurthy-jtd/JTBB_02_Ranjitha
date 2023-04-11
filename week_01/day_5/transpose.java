/*Write a program to transpose a given 2D Array
Input : [1,2,3],[4,5,6],[7,8,9]]
Output : [[1,4,7],[2,5,8],[3,6,9]]
*/


class main
{
	public static void main(String[] args)
	{
		int[][] arr= { {1,2,3},{4,5,6},{7,8,9} };
		int row = 3; 
		int  col = 3;
		int midrow = row/2; 
		
		// row constant col increment
		
		for(int c = 0; c < col ; c++)
		{
		
		System.out.print(arr[0][c]+" ");	
				
		} 
		
		for(int c = 0; c < col ; c++)
		{
		
		System.out.print(" "+arr[midrow][c]);	
				
		} 
		
		for(int c = 0; c < col ; c++)
		{
		
		System.out.print("   "+arr[row-1][c]);	
				
		} 
		
		
		
		
	}

}
