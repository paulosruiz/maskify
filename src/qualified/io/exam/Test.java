package qualified.io.exam;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {

		assertEquals("", Maskify.maskify(""));
		assertEquals("4###########5616", Maskify.maskify("4556364607935616"));
		assertEquals("4###-####-####-5616", Maskify.maskify(("4556-3646-0793-5616")));
		assertEquals("6######5616", Maskify.maskify(("64607935616")));
		assertEquals("ABCD-EFGH-IJKLM-NOPQ", Maskify.maskify(("ABCD-EFGH-IJKLM-NOPQ")));
		assertEquals("A#######BCDEFG89HI", Maskify.maskify(("A1234567BCDEFG89HI")));
		assertEquals("6###########5616", Maskify.maskify(("6460123457935616")));
		assertEquals("12345", Maskify.maskify(("12345")));
		assertEquals("Skippy", Maskify.maskify(("Skippy")));
	}

}
