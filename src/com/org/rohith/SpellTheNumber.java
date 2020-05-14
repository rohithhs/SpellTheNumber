package com.org.rohith;

import static com.org.rohith.Constants.ONE;
import static com.org.rohith.Constants.TEN;
import static com.org.rohith.Constants.CRORE;
import static com.org.rohith.Constants.LAKH;
import static com.org.rohith.Constants.HUNDRED;
import static com.org.rohith.Constants.THOUSAND;
import static com.org.rohith.Constants.AND;
import static com.org.rohith.Constants.EMPTY_STRING;

public class SpellTheNumber 
{
	static String numToWords(int n, String s) 
	{
		String str = EMPTY_STRING;

		if (n > 19) 
		{
			str += TEN[n / 10] + ONE[n % 10];
		} else 
		{
			str += ONE[n];
		}

		if (n != 0) 
		{
			str += s;
		}
		return str;
	}

	static String convertToWords(long number) 
	{
		String out = EMPTY_STRING;

		out += numToWords((int) (number / 10000000), CRORE);

		out += numToWords((int) ((number / 100000) % 100), LAKH);

		out += numToWords((int) ((number / 1000) % 100), THOUSAND);

		out += numToWords((int) ((number / 100) % 10), HUNDRED);

		if (number > 100 && number % 100 > 0) 
		{
			out += AND;
		}
		out += numToWords((int) (number % 100), EMPTY_STRING);
		return out;
	}

}
