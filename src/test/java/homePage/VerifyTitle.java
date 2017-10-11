package homePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {
	
	@Test
	public void HomePageTitle()
	{
		String title;
		System.out.println("Home Page Title Testing");
		System.setProperty("webdriver.gecko.driver", "./src/Browser_Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bbh.com");
        title=driver.getTitle();
        System.out.println(title);
		Assert.assertEquals("Brown Brothers Harriman", "Brown Brothers Harriman");
		System.out.println("Title Verified, Test End..!!");
		driver.quit();
	}

}
