/*Write a program to find a peak element, which is not smaller than its neighbors
Input : array[] = {5,10,20,15}
Output : 20
*/
/*
1.peak element means largest element
2.take one variable an store the string first charector 
3.checking the condition if the string elements is > firstelement or not 
*/

class main
{
	public static void main(String[] args)
	{
		int[] arr = {5,10,20,15};
		int firstElm = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > firstElm)
			{
				firstElm = arr[i];	
			}
			
		}
		System.out.println(firstElm);
	
	}
		
}
