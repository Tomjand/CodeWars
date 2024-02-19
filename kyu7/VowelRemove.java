package kyu7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.runners.JUnit4;
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//		For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//		Note: for this kata y isn't considered a vowel.
public class VowelRemove
{
	public class Troll {
		public static String disemvowel(final String str) {
			final String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
			final Set<String> vowelsSet = new HashSet<>(Arrays.asList(vowels));
			return Arrays.stream((str.split(("")))).filter(ch -> !vowelsSet.contains(ch)).reduce("",String::concat);
			//return str.replaceAll("[aAeEiIoOuU]", "");
		}
	}

	@Test
	public void FixedTests() {
		assertEquals("Ths wbst s fr lsrs LL!",Troll.disemvowel("This website is for losers LOL!")
		);
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel(
				"No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals( "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
	}
}
