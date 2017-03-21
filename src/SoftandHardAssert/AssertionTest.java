package SoftandHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	@Test
	public void testSoftAssert(){
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 is started");
		assertion.assertEquals(12, 13);
		System.out.println("Test 1 is completed");
		assertion.assertAll();
	}
	@Test
	public void testHardAssert(){
		
		System.out.println("Test 2 is started");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 is completed");
	}

}
