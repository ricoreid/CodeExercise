
public class Cipher
{

	public static void main(String[] args) 
	{
		String newStr; // variable to hold the value for each word from the string of words
		char[] cipher; // char array to store the characters of each word
		
		for(int i = 0; i < args.length; i++)
		{
			newStr = args[i]; // stores the first word from the string of words
			
			char[] arrayStr = newStr.toCharArray(); // converts words to an array of characters
			
			int lim = arrayStr.length - 1; // gets the length of the array
			cipher = new char[arrayStr.length]; // creates the object
			
			for(int j = 0; j < arrayStr.length; j++)
			{
				
				
				cipher[j] = arrayStr[lim - j]; // cipher the characters
				
				System.out.print(cipher[j]); // prints each character
			}
			
			System.out.print(" "); // separate each word
			
		}
		
		System.out.println();
	}

}
