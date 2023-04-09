/*Write a program to move all non zeros values to the left side of an array and zero values to the right side of an array?
Input : Array = [1,1,0,1,0,1,0,1,1];
Output : [1,1,1,1,1,1,0,0,0]
*/

class sorted
{
    public static void main(String[] args) 
    {
        int[] arr = {1,1,0,1,0,1,0,1,1};
        
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
        
        
        
        //i mens in temp elements 2 temp = arr[i];
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + ",");
        }
    }
}
