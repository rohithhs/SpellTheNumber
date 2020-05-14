package com.org.rohith.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.org.rohith.SpellTheNumber;

public class TestLogic 
{
	@Test  
    public void testConvertToWords()
	{  
		assertEquals("Thirteen Thousand Four Hundred and Fifty Six ",SpellTheNumber.convertToWords(13456));
		assertEquals("Forty Five Lakh Thirty Two Thousand One Hundred and Fifty Six ",SpellTheNumber.convertToWords(4532156));
		assertEquals("Twelve Crore Thirty Four Lakh Fifty Six Thousand Seven Hundred and Eighty Nine ",SpellTheNumber.convertToWords(123456789));
		assertEquals("Zero",SpellTheNumber.convertToWords(0));
		assertEquals("Zero",SpellTheNumber.convertToWords(00));
    }  
}
