package roman_converter;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {

	public static Map<Character, Integer> values = new HashMap<Character, Integer>();
	static {
		values.put('V', 5);
		values.put('X', 10);
		values.put('I', 1);
	}

	public int convert(String romanNumber) {
		int previous = 0;
		int arabic = 0;
		int current = 0;

		for (int i = 0; i < romanNumber.length(); i++) {
			current += values.get(romanNumber.charAt(i));

			if (previous < current && previous != 0) {
				current = current - previous;
				arabic -= previous;
			}
			arabic += current;
			previous = current;
			current = 0;

		}
		return arabic;

	}
}
