package roman_converter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanConverterTest {

	private RomanConverter testObj;

	@Before
	public void setUp() {
		testObj = new RomanConverter();
	}

	@Test
	public void it_should_convert_I_to_1() {
		assertEquals(testObj.convert("I"), 1);
	}

	@Test
	public void it_should_convert_II_to_2() {
		assertEquals(testObj.convert("II"), 2);
	}

	@Test
	public void it_should_convert_III_to_3() {
		assertEquals(testObj.convert("III"), 3);
	}

}
