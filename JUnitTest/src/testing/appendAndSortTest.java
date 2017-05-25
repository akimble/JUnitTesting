package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class appendAndSortTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<String> wordArray1 = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Cheese"));
		ArrayList<String> wordArray2 = new ArrayList<String>(Arrays.asList("Apple", "Cheddar"));
		ArrayList<String> wordArray3 = new ArrayList<String>(Arrays.asList("Apple"));
		ArrayList<String> wordArray4 = new ArrayList<String>();
		
		ArrayList<String> output12 = test.appendAndSort(wordArray1, wordArray2);
		ArrayList<String> output23 = test.appendAndSort(wordArray2, wordArray3);
		ArrayList<String> output34 = test.appendAndSort(wordArray3, wordArray4);
		ArrayList<String> output44 = test.appendAndSort(wordArray4, wordArray4);
		
		assertEquals(Arrays.asList("Apple", "Banana", "Cheddar", "Cheese"), output12);
		assertEquals(Arrays.asList("Apple", "Cheddar"), output23);
		assertEquals(wordArray3, output34);
		assertEquals(wordArray4, output44);
	}

}
