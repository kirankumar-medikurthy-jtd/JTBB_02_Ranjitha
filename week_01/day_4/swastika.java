/*Write a program to print the array element in the pattern below(i.e swastika pattern)?
            Example : input  : Array = [[1,2,3],[4,5,6],[7,8,9]]
                 Output =  1 4 5 6 9 7 8 5 2 3
*/

class ntraversa
{
	public static void main(String[] args)
	{
	int arr[][] = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };
		int col = 4;
		int row = 4;
		
		int rowmid  = row/2;
		int colmid = col/2;
		
		//*****first left swastik***
		//for first column only  ***1,5*** colum constant
		
		for(int r = 0; r < rowmid; r++)
		{
			System.out.print(arr[r][0]+" ");
		
		}
		
		
		//for second column ***11,12,13,14,15*** colum constant
		
		for(int c = 0; c <= col; c++)
		{
		
			System.out.print(arr[rowmid][c]+" ");
			
		}
		
		//last column ***20,25*** colum constant
		
		
		for(int r = rowmid+1; r <= row; r++)
		{
			System.out.print(arr[r][col]+" ");	
			
		}
		
		
		//***** second swastik***
		
		//for first row ***21,22*** row constant
		
		for(int c = 0; c < colmid; c++)
		{
			System.out.print(arr[row][c]+" ");
		
		} 
		
		
		//for second row ***23,18,13,8,3*** row constant
		
		for(int r = row; r >= 0; r--)
		{
		
		System.out.print(arr[r][colmid]+" ");
		
		}
		
		
		//for last row ***4,5*** row constant
		
		for(int c = colmid+1; c <= col; c++)
		{
		
		System.out.print(arr[0][c]+" ");
		
		}
			
	}
	
}





















































/*class swastika
{
        public static void main(String[] args) 
	{
		int [][] arr = { {1,14,13} , {4,9,6} , {8,8,9} };
		int row = 3; 
		int column = 3; 
		String result = "";
		String next ="";
		
		//only for left side
		
		for(int i = 0; i < row; i++)
		{
			for(int  j = 0; j< column; j++)
			{
				if(i == 0 && j ==0 || i == 1 || j == column||i == row-1 && j ==column-1)
				{
				result+=arr[i][j]+" ";
				
				}
			}
		
		}
		
		
		for(int k = row-1 ; k >= 0; k --)
		{
			for(int a = column-1; a >= 0; a--)
			{
				if(a == 1 || k ==row || a == 0 && k ==row-1 || k == 0 && a ==row-1 )
				{
				next+=arr[k][a]+" ";
				  
				}
				
			}
		
		}
		//System.out.println(result);
       		System.out.println(result+" "+next);
       		//for right side 
       		
       		
       		
	}

}
*/

//i == 0 && j ==0 || i == 1 || j == column||i == row-1 && j ==column-1 ||



//j == 0 && i == column-1  for 7 



/*for(int i = row-1; i >= 1; i--){ 
       		System.out.print(array[i][0]+" ");
       	}*/









//|| a == 1 || k ==row




/*//first row only two elements" 1 , 4 "
		for(int i = 0; i < row-1; i++)
		{
		System.out.print(arr[i][0]+" ");
		}
		
		//only for middle element
		int i = 1;
       		int j = 1;
       		while(i < row-1 && j < column-1)
       		{
       		System.out.print(arr[i++][j++]+" ");
       		}
       		
       		// last element
       		for(int i = 0; i < row-1; i++)
		{
		System.out.print(arr[i][0]+" ");
		}*/
