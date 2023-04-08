/*WWrite a program to print “Z” Traversal  elements present in an array?
Example : Input  : [[1 3  4][6 3 2][9 2 10]]                          
                                           Output :  1 3 4 3 9 2 10
*/

class Ztraversal	
{
	public static void main(String[] args)
	{
	int[][] arr = { {1 , 3 , 4},{6 , 3 , 2},{ 9 , 2 , 10} };
	int row = 3; 
	int column = 3;
	String result ="";
	
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				if(i == 0 ||j ==1 && i == 1|| i == row-1)
				{
				result+=arr[i][j]+" ";
				}
			}	
		}
	
		System.out.println(result);
		
	}	
}
