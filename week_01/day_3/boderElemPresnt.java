/*Write a program to print all border elements present in a 2d array??
Example : Input 1 : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                        Output1 :  1  6 9 2 10 2 4 3     
*/

class boderElementsPresent
{
	public static void main(String[] args)
	{
	int[][] arr = { {1,3 ,4},{6,7,2},{9,2,10},{1,3 ,4} };  
	
	int rows = 3;
	int  columns = 3;
	String result ="";
	
		for(int i = 0; i < rows; i++)
		{
		 	for(int j = 0; j < columns; j++)
		 	{
				if( i == 0 || j == 0 || i == rows-1 || j == columns-1)
				{
				result+=arr[j][i]+" ";
				
				}
			}

		}
		System.out.println(result);

	}

}



