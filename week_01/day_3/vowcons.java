/*Write a program to count all vowels and consonants present in a string?
Example : input : “jtbfoundation”
                 Output : 4
*/
class vowesandconsonants
{
	public static void main(String[] args)
	{
	
	String str ="jtbfoundation";
	int vowelcount=0;
	int consonantcount=0;
	
		for(int i = 0; i < str.length()-1; i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
			vowelcount++; 
			}
			else
			{
			consonantcount++;
			}
			
		}
		
		System.out.println(vowelcount);
		
		System.out.println(consonantcount);
	}

}
