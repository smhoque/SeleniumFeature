package TestNGsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGscripts {
  @Test(priority=1,description="This test will verify login operation")
  public void loginApplication() {
	  
	  System.out.println("This is a login Application");
	  Assert.assertEquals(12, 13);
  }
  @Test(priority=2, description="This test will verify select operation")
  public void seletItems(){
	  System.out.println("This is a select Items");
  }
  
  @Test(priority=-3, description="This test will verify checkout operation")
  public void CheckOut(){
	  System.out.println("This is a Checkout");
  }
}
