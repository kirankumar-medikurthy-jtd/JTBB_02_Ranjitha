//Find a string whether it contains alphanumeric characters or not?

import java.util.*;
class alphanumeric
{
	public static void main(String[] args)
	{
		String string = "ramyaranjitha@17";
		
		
		//String str = string.toLowerCase();
		
		char[] array = string.toCharArray();
		
		System.out.println(array);
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String special = "!@#$%^&*";
		
		
		int alphaCount = 0;
		int numbersCount = 0;
		int specialCount = 0;
		
		for(int i = 0; i < string.length(); i++)
		{
			if(CharacterChecking(string.charAt(i), alpha)) {
				alphaCount += 1;
			}else if(CharacterChecking(string.charAt(i), numbers)) {
				numbersCount += 1;
			}else {
				specialCount += 1;
			}

		}
		System.out.println(alphaCount+" "+numbersCount+" "+specialCount);
		if(alphaCount > 0 && numbersCount > 0 && specialCount > 0)
		{
			System.out.println("String contains alphanumeric characters");
		}
		else
		{
			System.out.println("String not contains alphanumeric characters");
		}	
		
	}
	public static boolean CharacterChecking(char Character, String str){
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == Character){
				return true;
			}
		}
		return false;
	}
}
