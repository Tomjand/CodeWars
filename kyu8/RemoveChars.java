package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
* Your goal is to create a function that removes the first and last characters of a string.
* You're given one parameter, the original string. You don't have to worry about strings with less than two characters.
* */
public class RemoveChars
{
	public static String remove(final String str)
	{
		return str.substring(1, str.length() - 1);
	}

	@Test
	public void testRemoval()
	{
		assertEquals("loquen", RemoveChars.remove("eloquent"));
		assertEquals("ountr", RemoveChars.remove("country"));
		assertEquals("erso", RemoveChars.remove("person"));
		assertEquals("lac", RemoveChars.remove("place"));
	}

}
