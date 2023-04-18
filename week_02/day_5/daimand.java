/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 3 2 6 8(snake) task;-4 2 6 8 4(daimand)
*/


//snake traversal
/*class main
{
	public static void main(String[] args)
	{
	int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	
	int rows = 3;
	int cols = 3;
	int colmid = cols/2;
	int rowmid = rows/2;
	
	
	
	
	//for first input
		for(int c = cols-1; c >= colmid; c--)
		{
		
		System.out.print(arr[0][c]+" ");
		
		}
		
		
	//for second out put
		
		System.out.print(arr[rowmid][cols-1]+" ");
		
		System.out.print(arr[rows-1][rowmid]+" ");
	 

	}

}*/

//traversal

class main
{
	public static void main(String[] args)
	{
	
	int [][] arr = { {1,2,3},{4,5,6},{7,8,9} };
	
	int rows = 3;
	int cols = 3;
	int colmid = cols/2;
	int rowmid = rows/2;
	
	
	
	
	System.out.print(arr[rowmid][0]+" ");
	
	System.out.print(arr[0][colmid]+" ");
	 
	System.out.print(arr[rowmid][cols-1]+" ");
		
	System.out.print(arr[rows-1][rowmid]+" ");
	
	System.out.print(arr[rowmid][0]+" ");
	 
	}

}
