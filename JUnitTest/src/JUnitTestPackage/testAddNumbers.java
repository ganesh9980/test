package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit = new JUnitFunction();
		int result=junit.addNumbers(100,200);
		assertEquals(300,result);
	}

}