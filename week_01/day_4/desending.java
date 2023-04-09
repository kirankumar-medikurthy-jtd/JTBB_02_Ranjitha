/*Write a program to sort an array in the descending order without an inbuilt sort method?
Example : input : [2,8,6,5,9,4,7]
                 Output : [9,8,7,6,5,4,2]*/


class sorted
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 8, 6, 5, 9, 4, 7};
        
      int temp = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                   temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        
        System.out.println(temp);
        
        //i mens in temp elements 2 temp = arr[i];
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + ",");
        }
    }
}
