/*Write a program to print the next greater element present in an array?
Example : Input: arr[] = [ 4 , 5 , 2 , 25 ]
                Output:  4      –>   5
                              5      –>   25
                               2      –>   25
                               25     –>   -1
*/


class main
{
	public static void main(String[] args)
	{
	
		int arr[] = { 4 , 5 , 2 , 25 };
		//String result="";
		
		
		for(int i = 0; i < arr.length; i++)
		{
			int temp = 0;
			for(int j = i + 1 ; j < arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
				temp+=arr[j];
				break;
				}
				
				
			}

		
		
		if(temp != 0)
		{
		
		System.out.println(arr[i] +" -> "+temp);
		}
		else
		{
			System.out.println(arr[i]+" -> "+"-1 ");
		}
		}
	
	}
	

}
