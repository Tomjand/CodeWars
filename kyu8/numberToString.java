package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class numberToString
{
	public static String numberToString(final int num) {
		return String.valueOf(num);
	}
	@Test
	public void tests() {
		assertEquals("67", numberToString.numberToString(67));
		assertEquals("123", numberToString.numberToString(123));
		assertEquals("999", numberToString.numberToString(999));
	}
}
