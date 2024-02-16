package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class ReversedStrings
{
	public static String solution(final String str) {
		return new StringBuilder(str).reverse().toString();
	}
	@Test
	public void sampleTests() {
		assertEquals("dlrow", ReversedStrings.solution("world"));
	}

}
