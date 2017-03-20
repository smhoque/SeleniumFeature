package AssertionSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionOperation {
  
	@Test
	public void test1(){
		Assert.assertEquals(12, 13);
	}
}
