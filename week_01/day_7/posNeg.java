/*Write a program to move all negative number to left side of an array and all positive number to the right side of an array;
Input : [0,-10,8,-20,-1,3,-9]
Output : [-10,-20,-1,-9,0,8,3]
*/
/*
1.if the arr char is less than(<) 0 positive store one side else store anotherside like "result=arr[i]+result"
*/

class main
{
	public static void main(String[] args)
	{
		int[] arr  = {0,-10,8,-20,-1,3,-9};
		String result="";
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] >= 0)
			{
				result+=","+arr[i];
			}
			if(arr[i] < 0)
			{
				result=","+arr[i]+result;
			}
			
		}
		System.out.println(result);
	
	
	}

}
