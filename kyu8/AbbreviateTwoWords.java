package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AbbreviateTwoWords
{
	public static String abbrevName(final String name) {
		final String[] firstname = name.split(" ", 1);
		System.out.println(firstname);
		return name;
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
