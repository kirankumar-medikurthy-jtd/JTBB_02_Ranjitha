/*Write a program to sort an array of 0’s, 1’s, and 2’s .
Input : Array = [0,1,2,0,1,2]
Output : [0,0,1,1,2,2]
*/

class main
{
	public static void main(String[] args)
	{
		int [] arr = {0,1,2,0,1,2};
		
		
		String result = "";
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
			{
			result=arr[i]+result;
			
			}
			if(arr[i] == 1)
			{
			result+=arr[i];
			}
			
		}
		for(int i = 0 ; i < arr.length; i++)
		{
			if(arr[i] == 2)
			{
			result+=arr[i];
			ws	}
		}
		System.out.println(result);
		
	}
	
}
