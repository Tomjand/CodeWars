package kyu8;
import java.util.stream.IntStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Summation
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0. Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.
For example (Input -> Output):
2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
public class GrassHopper
{
	public static int summation(final int n) {
		final int[] arr =IntStream.rangeClosed(1,n).toArray();
		return IntStream.of(arr).sum();
	}

	@Test
	public void test1() {
		assertEquals(1,
				GrassHopper.summation(1));
	}
	@Test
	public void test2() {
		assertEquals(36,
				GrassHopper.summation(8));
	}
}
