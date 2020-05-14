package com.org.rohith;

import java.util.Scanner;
import static com.org.rohith.Constants.INPUT_MESSAGE;
import static com.org.rohith.Constants.INVALID_INPUT_MESSAGE;

public class DriverClass 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		long number = 0;
		System.out.println(INPUT_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextLong();
		int len = String.valueOf(number).length();	
		if(len>9)
		{
			System.out.println(INVALID_INPUT_MESSAGE);
		}else 
		{
			System.out.printf(SpellTheNumber.convertToWords(number));
		}
	}
}
