package kyu7;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
public class highAndLow
{
	public static String highAndLow(final String numbers) {
		final String[] numbersArray = numbers.split(" ");
		final int max = Arrays.stream(numbersArray).mapToInt(Integer::parseInt).max().orElse(0);
		final int min = Arrays.stream(numbersArray).mapToInt(Integer::parseInt).min().orElse(0);
		return (max + " " + min);
	}

	@Test
	public void test1() {
		assertEquals("42 -9", highAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}
	@Test
	public void test2() {
		assertEquals("3 1", highAndLow.highAndLow("1 2 3"));
	}
}
