package kyu8;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class BasicOperations
{
	public static Integer basicMath(final String op, final int v1, final int v2)
	{
		return switch (op)
		{
			case "+" -> v1 + v2;
			case "-" -> v1 - v2;
			case "*" -> v1 * v2;
			case "/" ->
			{
				if (v2 == 0)
				{
					throw new ArithmeticException("Cannot divide by zero");
				}
				yield v1 / v2;
			}
			default -> throw new IllegalArgumentException("Bad operation: " + op);
		};
	}

	@Test
	public void testBasics()
	{
		System.out.println("Basic Tests");
		assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
		assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
		assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
		assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
	}

}
