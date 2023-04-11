/*Write a program to print all the element in a string in the form “C” pattern in a 2D array
Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
Output : 1 2 3 4 7 8 9
*/

class main
{
	public static void main(String[] args)
	{
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};	
	
	int row = 3;
	int col = 3;
	int colmid = col/2;
	
	
		//row  constant colum increment  reverse loop for c pattern
		
		for(int c = col-1; c >=0; c--)
		{
		System.out.print(arr[0][c]+" ");
		
		}
		
		// column constant row increment
		
		for(int r = 1 ; r < row; r++)
		{
		
		System.out.print(arr[r][0]+" ");
		
		}
		
		//row constant column increment
		
		for(int c = colmid; c <= col-1; c++)
		{
		System.out.print(arr[row-1][c]+" ");
		} 
		
		
	}

}
