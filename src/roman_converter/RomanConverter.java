package roman_converter;

public class RomanConverter {

	public int convert(String romanNumber) {

		int arabic = 0;
		for (int i = 0; i < romanNumber.length(); i++) {
			arabic++;
		}
		return arabic;

	}
}
