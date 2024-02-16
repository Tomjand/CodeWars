package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Positive
{
	public static int sum(final int[] arr)
	{
		int sum = 0;
		for (final int i : arr)
		{
			sum += Math.max(i, 0);
		}
		return sum;
	}

	@Test
	public void testSomething()
	{
		assertEquals(15, Positive.sum(new int[]{ 1, 2, 3, 4, 5 }));
		assertEquals(13, Positive.sum(new int[]{ 1, -2, 3, 4, 5 }));
		assertEquals(0, Positive.sum(new int[]{}));
		assertEquals(0, Positive.sum(new int[]{ -1, -2, -3, -4, -5 }));
		assertEquals(9, Positive.sum(new int[]{ -1, 2, 3, 4, -5 }));
	}
}
