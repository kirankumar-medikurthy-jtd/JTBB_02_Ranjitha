//Write a program to calculate a product of all elements in an array?


class product
{
	public static void main(String[] args)
	{
	int[] arr ={1, 2, 3, 4, 5, 6, 7};

	System.out.println(product(arr));
	
	}
	
	public static int product(int[] arr)
	{
	int bag=1;
		for(int i=0; i< arr.length; i++)
		{
		bag*=arr[i];
		}
		return bag;
	}
}
