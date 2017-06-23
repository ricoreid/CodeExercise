package com.IGDemo;

public class App {

	public static void main(String[] args) 
	{
		AppImplementation appImp = new AppImplementation();
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.printf("%s ", appImp.cipher(args[i]));
		}

	}

}
