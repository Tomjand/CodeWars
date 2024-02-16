package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
* Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him
Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message :)
If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
If he doesn't get 10 hoops, return the string "Keep at it until you get it".
* */
public class hoopCount
{
	public static String hoopCount(final int n)
	{
		return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
	}

	@Test
	public void testHoopCount()
	{
		assertEquals("Great, now move on to tricks", hoopCount.hoopCount(11));
		assertEquals("Keep at it until you get it", hoopCount.hoopCount(7));
	}
}
