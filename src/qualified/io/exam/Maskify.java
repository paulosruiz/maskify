
package qualified.io.exam;

public class Maskify {

	private static final int VISIBLE_LENGTH = 4;
	private static final int MIN_LENGHT = 6;

	/*
	 * public static String maskify(String creditCardNumber) {
	 * 
	 * if (creditCardNumber != null && creditCardNumber.length() < MIN_LENGHT) {
	 * return creditCardNumber; }
	 * 
	 * StringBuilder sb = new StringBuilder();
	 * sb.append(creditCardNumber.charAt(0));
	 * 
	 * for (int i = 1; i < creditCardNumber.length() - VISIBLE_LENGTH; i++) {
	 * 
	 * char charPos = creditCardNumber.charAt(i);
	 * 
	 * if (Character.isDigit(charPos)) { sb.append("#"); } else {
	 * sb.append(charPos); } } String lastFour =
	 * creditCardNumber.substring(creditCardNumber.length() - VISIBLE_LENGTH,
	 * creditCardNumber.length());
	 * 
	 * sb.append(lastFour); return sb.toString(); }
	 */

	public static String maskify(String creditCardNumber) {

		final int creditCardLength = creditCardNumber.length();
		if (creditCardLength < MIN_LENGHT)
			return creditCardNumber;
		else {
			String last4Characters = creditCardNumber.substring(creditCardLength-VISIBLE_LENGTH, creditCardLength);
			String firstCharacter = creditCardNumber.substring(0, 1);

			String maskingCharacters = creditCardNumber.substring(1, creditCardLength - VISIBLE_LENGTH).replaceAll("[0-9]",
					"#");

			return firstCharacter + maskingCharacters + last4Characters;
		}
	}
}
