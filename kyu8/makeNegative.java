package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
In this simple assignment you are given a number and have to make it negative.
But maybe the number is already negative?
 */
public class makeNegative
{
	public static int makeNegative(final int x)
	{
		return x < 0 ? x : x * (-1);
	}

	@Test
	public void test1()
	{
		assertEquals(-42, makeNegative.makeNegative(42));
	}
}
