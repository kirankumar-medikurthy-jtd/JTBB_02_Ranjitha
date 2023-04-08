/*Write a program to calculate a  sum of left diagonal and right diagonal elements present in 2D arrays?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                         Output :  27
*/

class daigonal
{
	public static void main(String[] args)
	{
	int [][] arr ={ {1 , 3 , 4},{6 , 3 , 2},{ 9 , 2 , 10} };
	int row = 3;
	int column = 3;
	int sum = 0;
	String result="";
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				if((i==0 && j==0 || i==1 && j== 1 || i==row-1 && j==column-1)||(j==column-1 && i==0 || i==row-1	 && j==0))
				{
				result+=arr[i][j]+" ";
				 sum+=arr[i][j];
				
				}
			}
		} 
		System.out.println(result);
		System.out.println(sum);
	}
}
//i==0 && j==0 || i==1 && j== 1 || i==row-1 && j==column-1 ||  
