package TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListener.TestNGListN.class)
public class TestCase {
	
	@Test
	public void GoogleTitleVerify(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\riponctg\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
