/*Write a program to cipher the string?
 Example : input : str = “aabccdddee”
                  Output : a2b1c2d3e2
*/  
public class main
{
	public static void main(String[] args)
	{
		String str = "aabccdddee";
		char arr[] = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) 
		{
           		 int count = 1;
           		 boolean check = false;
           		 for(int j = 0; j < i; j++) 
           		 {
               			 if(arr[j] == arr[i]) 
               			 {
                   			 check = true;
                    			 break;
               			 }
            		}
            		if(!check) 
            		{
                		for(int j = i+1; j < arr.length; j++) 
                		{
                   			 if(arr[j] == arr[i]) 
                   			 {
                        			count++;
                   			 }
                		}
               		 	System.out.print(arr[i] +""+ count);
           		}
        	}
	
	}

}
