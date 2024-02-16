package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class repeatString
{
	public static String repeatStr(final int repeat, final String string) {

		String newString = "";
		for(int i = 0; i<repeat;i++){
			newString = newString.concat(string);
		}
		return newString;
	}
	@Test public void test4a() {
		assertEquals("aaaa", repeatString.repeatStr(4, "a"));
	}
	@Test public void test3Hello() {
		assertEquals("HelloHelloHello", repeatString.repeatStr(3, "Hello"));
	}
	@Test public void test5empty() {
		assertEquals("", repeatString.repeatStr(5, ""));
	}
	@Test public void test0kata() {
		assertEquals("", repeatString.repeatStr(0, "kata"));
	}
}
