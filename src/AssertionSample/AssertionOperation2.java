package AssertionSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionOperation2 {
  
	@Test
	public void test1(){
		String str = "Sm Hoque";
		Assert.assertTrue(str.contains("Ripon"), "Name does not match");
	}
	@Test
	public void test2(){
		Assert.assertTrue(false);
	}


}
