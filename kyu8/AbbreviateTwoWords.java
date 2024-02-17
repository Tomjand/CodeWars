package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
* Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
* */
public class AbbreviateTwoWords
{
	public static String abbrevName(final String name) {
		return name.split(" ")[0].substring(0,1).toUpperCase()+"."+name.split(" ")[1].substring(0,1).toUpperCase();
	}

	@Test
	public void testFixed() {
		assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
		assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
		assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
		assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
		assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
	}
}
