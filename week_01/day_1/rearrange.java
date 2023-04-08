 //Given an array of number rearrange the array according to below example
//Input : Array = [2,3,4,6,5,1,8]
//Output : Array = [2,4,6,8,3,5,1]


class reArrange
{
	public static void main(String[] args)
	{
	int[] arr ={2,3,4,6,5,1,8};
	int startpoint = 0;
	int endpoint = arr.length-1;
		while(startpoint < endpoint)
		{
			if(arr[startpoint] % 2 == 0 || arr[endpoint] % 2 == 0)
			{
			endpoint--;
			}
			else if(arr[startpoint] % 2 != 0 || arr[endpoint] % 2 != 0)
			{
			
			startpoint++;
			}
			else if(arr[startpoint] % 2 == 0 || arr[endpoint] % 2 != 0)
			{
			endpoint--;
			startpoint++;
			}
			else 
			{
			endpoint--;
			startpoint++;
			
			}
			
			if(startpoint < endpoint)
			{
			int temp = arr[startpoint];
			arr[startpoint] = arr[endpoint];
			arr[endpoint] = temp;
			startpoint++;
			endpoint--;
			}

		}
		for(int i=0 ; i < arr.length; i++)
		{
		System.out.print(arr[i]+",");
		}
	}
}


