
package qualified.io.exam;

public class Maskify {

	private static final int VISIBLE_LENGTH = 4;
	private static final int MIN_LENGHT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("");
		System.out.println(maskify("4556364607935616"));

		System.out.println(maskify("4556-3646-0793-5616"));

		System.out.println(maskify("64607935616"));

		System.out.println(maskify("ABCD-EFGH-IJKLM-NOPQ"));

		System.out.println(maskify("A1234567BCDEFG89HI"));

		System.out.println(maskify("6460123457935616"));

		System.out.println(maskify("12345"));

		System.out.println(maskify("Skippy"));

	}

	public static String maskify(String creditCardNumber) {

		if (creditCardNumber != null && creditCardNumber.length() < MIN_LENGHT) {
			return creditCardNumber;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(creditCardNumber.charAt(0));

		for (int i = 1; i < creditCardNumber.length() - VISIBLE_LENGTH; i++) {

			char charPos = creditCardNumber.charAt(i);

			if (Character.isDigit(charPos)) {
				sb.append("#");
			} else {
				sb.append(charPos);
			}
		}
		String lastFour = creditCardNumber.substring(creditCardNumber.length() - VISIBLE_LENGTH,
				creditCardNumber.length());

		sb.append(lastFour);
		return sb.toString();
	}

}
