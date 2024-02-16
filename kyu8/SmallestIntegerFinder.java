package kyu8;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Given an array of integers your solution should find the smallest integer.
For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder
{
	public static int findSmallestInt(final int[] args) {
		return Arrays.stream(args).min().getAsInt();
	}
	@Test
	public void example1(){
		final int expected = 11;
		final int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
		assertEquals(expected, actual);
	}

	@Test
	public void example2(){
		final int expected = -33;
		final int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
		assertEquals(expected, actual);
	}

	@Test
	public void example3(){
		final int expected = Integer.MIN_VALUE;
		final int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
		assertEquals(expected, actual);
	}
}
