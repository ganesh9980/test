package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunction junitstring = new JUnitFunction();
		String result=junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}