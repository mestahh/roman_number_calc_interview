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
	public void it_should_convert_1_to_I() {
		assertEquals(testObj.convert("I"), 1);
	}

	@Test
	public void it_should_convert_2_to_II() {
		assertEquals(testObj.convert("II"), 2);
	}

}
