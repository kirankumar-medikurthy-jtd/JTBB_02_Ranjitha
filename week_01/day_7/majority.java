/*Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
*/
/*
1.comparing first elemet and second elementat the same time counting the elemnts here we runing the second loop j = 0 to j = firstloop(i)
it will give a particular number count
2.or else if the first condition is no not another condition will be executed again comaring first loop and another one forloop with same varible names 
3.again checking the condition and count after that if the arr[i] elements > maximum it will gives maximum count of each element

*/
public class main
{
	public static void main(String[] args)
	{
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 3};
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) 
		{
           		 int count = 1;
           		 boolean ok = false;
           		 for(int j = 0; j < i; j++) 
           		 {
               			 if(arr[j] == arr[i]) 
               			 {
                   			 ok = true;
                    			 break;
               			 }
            		}
            		if(!ok) 
            		{
                		for(int j = i+1; j < arr.length; j++) 
                		{
                   			 if(arr[j] == arr[i]) 
                   			 {
                        			count++;
                   			 }
                   			 
                   			 if(arr[i] > max)
                   			 {
                   			 max = arr[i];
                   			 System.out.println("max count"+max);
                   			 }
                   			 
                   			 
                		}
                		
           		}
           		
        	}
	
	}

}
