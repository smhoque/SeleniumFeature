package AssertionSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionOperation {
  
	@Test
	public void test1(){
		Assert.assertEquals(12, 13);
	}
	@Test
	public void test2(){
		System.out.println("Test 2 is started");
		Assert.assertEquals(12, 13, "DropDown count does not match please check with the developer");
		System.out.println("Test 2 is completed");
	}
	@Test
	public void test3(){
		System.out.println("Test 3 is started");
		Assert.assertEquals("Hello", "Hello", "Word does not match please check with the developer");
		System.out.println("Test 3 is completed");
	}
}
