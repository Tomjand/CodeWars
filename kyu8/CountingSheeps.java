package kyu8;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Objects;
import org.junit.Test;
/*
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
 */
public class CountingSheeps
{
	Boolean[] array1 = { true, true, true, false,
			true, true, true, true,
			true, false, true, false,
			true, false, false, true,
			true, true, true, true,
			false, false, true, true };

	public static int countSheeps(final Boolean[] array1)
	{
		return Math.toIntExact(Arrays.stream(array1)
		                             .filter(Objects::nonNull)
		                             .filter(Boolean::booleanValue).count());
	}

	@Test
	public void test()
	{
		assertEquals("There are 17 sheeps in total", 17, countSheeps(array1));
	}
}