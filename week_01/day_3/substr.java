/*Write a program to generate all the substring  present in a string?
Example : input : “bootcamp”;
                 Output : 10
*/
class substring
{
	public static void main(String[] args)
	{
		String str = "bootcamp";
		int count=0;
		String sub="";
		
		for(int i = 0;i<=str.length();i++)
		{
			for(int j=i;j<=str.length()-1;j++)
			{
				sub += str.charAt(j)+",";	
				count++;
			}
		}
		System.out.println(sub);
		System.out.println(count);
	}
}

/*class substr
{
	public static void main(String[] args)
	{
	String str ="bootcamp";
	
	int end=str.length();
	//String result = "";
	int count = 0; 
	
		for(int i = 0; i < end; i++)
		{
			for(int j = i ; j <end; j++)
			{
			count++;
			//result+=str.charAt(i);			
			}
		}
		System.out.println(count);
		//System.out.println(result);
	}

}*/
