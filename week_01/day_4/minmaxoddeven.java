/*Write a program to check if the sum of maximum and minimum elements present in an array is even number or odd number?
                Example : input :Array = [3,8,19,3,2,7,6], output :  “odd number”
*/
class minMaxOddEven
{
	public static void main(String[] args)
	{
	int[] arr ={3,8,19,3,2,7,6};
	int min = arr[0]; 
	int max = arr[0];
	int sum = arr[0];
	int result=0;
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] < min)
			{
			min=arr[i];
			}
			
			if (arr[i] > max)
			{
			max=arr[i];
			}

		}
		result+=min+max;
		//for(int j = 0; j < result.length
		if(result % 2 == 0)
		{
		System.out.println("Even");
		}
		else
		{
		System.out.println("Odd");
		}
	}
	
} 
