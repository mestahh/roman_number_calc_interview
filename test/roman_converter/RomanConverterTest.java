package roman_converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanConverterTest {

	@Test
	public void it_should_convert_1_to_I() {
		RomanConverter converter = new RomanConverter();
		assertEquals(converter.convert(1), 1);
	}

}
