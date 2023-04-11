/*Write a program to print all the element in a string in the form “T” pattern in a 2D array
Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
Output : 1 2 3 5 8
*/

class main
{
	public static void main(String[] args)
	{
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
	int row = 3;
	int col = 3;
	int colmid = col/2;
	
		//first row row constant colm increment
		
		for(int c = 0; c < col; c++)
		{
		System.out.print(arr[0][c]+" ");
		
		}
		
		//second column colm constatnt row increment
		
		for(int r = 1; r < row; r++)
		{
		System.out.print(arr[r][colmid]+" ");
		
		}
	}
	
}
