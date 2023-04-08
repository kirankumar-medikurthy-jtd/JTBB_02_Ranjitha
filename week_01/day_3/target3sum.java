/*Write a program to check to print indices of three numbers present in an array, whose sum is equal to target value ?
            Example : input  : Array = [2,3,4,6,8,1];     Target : 13
                 Output = 1,2,3
*/

class target3sum
{
	public static void main(String[] args)
	{
	int [] arr ={2,3,4,6,8,1};
	int target = 13;
	String bag ="";
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i; j < arr.length-1; j++)
			{
				
				for(int k = j; k < arr.length-1; k++)
				{
					if(arr[i]+arr[j]+arr[k] == target)
					{
					bag=i+","+j+","+k+"="+target;	
					}
				 
				 }
				 
			}
			
		}
		System.out.print(bag);
	}	
	
}
