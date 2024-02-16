package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class YesOrNo
{
	public static String boolToWord(boolean b)
	{
		return (b == true) ? "Yes" : "No";
	}
	@Test
	public void testBoolToWord() {
		assertEquals(YesOrNo.boolToWord(true),"Yes");
		assertEquals(YesOrNo.boolToWord(false),"No");
	}
}
