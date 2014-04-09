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

	@Test
	public void it_should_convert_V_to_5() {
		assertEquals(testObj.convert("V"), 5);
	}

	@Test
	public void it_should_convert_VI_VII_and_VIII_properly() {
		assertEquals(testObj.convert("VI"), 6);
		assertEquals(testObj.convert("VII"), 7);
		assertEquals(testObj.convert("VIII"), 8);
	}

	@Test
	public void it_should_convert_IV_to_4() {
		assertEquals(testObj.convert("IV"), 4);
	}

}
