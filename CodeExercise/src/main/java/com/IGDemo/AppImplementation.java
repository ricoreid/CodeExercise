package com.IGDemo;

public class AppImplementation 
{
	
	public String cipher(String word)
	{
		String result = new String();
		char[] charsOfWord = word.toCharArray();
		char[] ciphered = new char[charsOfWord.length];
				
		int lim = charsOfWord.length - 1;
		
		for(int i = 0; i <= lim; i++)
		{
			ciphered[i] = charsOfWord[lim - i];
			result = result + ciphered[i];
		}
		
		return result;
	} // end method cipher
	
} // end class
