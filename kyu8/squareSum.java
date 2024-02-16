package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
public class squareSum
{
	public static int squareSum(final int[] n)
	{
		return Arrays.stream(n).map(i -> i*i).sum();
	}
	@Test
	public void testBasic()
	{
		assertEquals(9, squareSum.squareSum(new int[] {1,2,2}));
		assertEquals(5, squareSum.squareSum(new int[] {1,2}));
		assertEquals(50, squareSum.squareSum(new int[] {5,-3,4}));
		assertEquals(0, squareSum.squareSum(new int[] {}));
	}
}
