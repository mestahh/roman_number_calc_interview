package roman_converter;

public class RomanConverter {

	public int convert(String romanNumber) {
		int previous = 0;
		int arabic = 0;
		int current = 0;
		for (int i = 0; i < romanNumber.length(); i++) {
			if (romanNumber.charAt(i) == 'V') {
				current += 5;
			} else if (romanNumber.charAt(i) == 'I') {
				current++;
			}

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
