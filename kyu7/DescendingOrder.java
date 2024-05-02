package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in
// descending order. Essentially, rearrange the digits to create the highest possible number.
//Input: 42145 Output: 54421
public class DescendingOrder
{
	public static int sortDescStream (final int num) {

		final String numStr = Integer.toString(num)
		                             .chars()
		                             .mapToObj(c->String.valueOf((char)c))
		                             .sorted(Collections.reverseOrder())
		                             .map(String::valueOf)
		                             .collect(Collectors.joining());

		return Integer.parseInt(numStr);
	}
	@Test
	public void test_01s() {
		assertEquals(0, DescendingOrder.sortDescStream(0));
	}

	@Test
	public void test_02s() {
		assertEquals(51, DescendingOrder.sortDescStream(15));
	}

	@Test
	public void test_03s() {
		assertEquals(987654321, DescendingOrder.sortDescStream(123456789));
	}
}
