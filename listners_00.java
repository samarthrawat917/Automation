package TestNG_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class listners_00 {
	WebDriver driver;

	@Test
	public void f() {
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium"
				+ "\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.myntra.com");
		System.out.println("Title..:"+driver.getTitle());
		System.out.println("URL...:"+driver.getCurrentUrl());
		driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TC-2 is dummy.....:");
		Assert.assertTrue(false);
	}

}
