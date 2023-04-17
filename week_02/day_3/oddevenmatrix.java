/*Write a program to print all the even indices  element at beginning and all odd indices element at the end present  in the matrix below traversal
Input : mat[][] = {{1, 2, 3,10}, 
                             {4, 5, 6,11}, 
                             {7, 8, 9,12},
                              {13,14,15,16}}
Output : 1  3 4 6 7 9 13 15 2 10 5 11 8 12  16
*/
/*
1.in a matrix the column only we take for checking condition  either even or not depending on out put 
2.


*/

class main 
{
	public static void main(String[] args)
	{
	int [][] arr = { {1, 2, 3,10},{4, 5, 6,11},{7, 8, 9,12},{13,14,15,16} };
	int col = 4;
	int row = 4;
	//String result="";
	
	
		for(int r = 0; r < arr.length ; r++)
		{
			for(int c = 0; c < arr.length; c++)
			{
				if(c % 2 == 0)
				{
				
				System.out.print(arr[r][c]+" ");
				
				}
			
			
			}
		
		
		}
		
		//second one 
		for(int r = 0; r < arr.length ; r++)
		{
			for(int c = 0; c < arr.length; c++)
			{
				if(c % 2 == 1)
				{
				
				System.out.print(arr[r][c]+" ");
				
				}
			
			
			}
		
		
		}
		
		
		
	}

}
