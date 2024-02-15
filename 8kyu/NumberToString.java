import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
* We need a function that can transform a string into a number. What ways of achieving this do you know?
Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
* */
public class NumberToString
{
	public static String numberToString(final int num) {
		return Integer.toString(num);
	}
	@Test
	public void tests() {
		assertEquals("67", NumberToString.numberToString(67));
		assertEquals("123", NumberToString.numberToString(123));
		assertEquals("999", NumberToString.numberToString(999));
	}
}
