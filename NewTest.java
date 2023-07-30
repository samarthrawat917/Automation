package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void linkTest() {
		List<WebElement> Hylink = driver.findElements(By.tagName("a"));
		System.out.println("HyperlinkCount..:"+Hylink.size());
	}
	@Test(priority=0)
	public void imglTest() {
		List<WebElement> IMlink = driver.findElements(By.tagName("img"));
		System.out.println("Imagelink....:"+IMlink.size());
	}
	@BeforeTest
	public void Init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium"
				+ "\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.myntra.com");
		Thread.sleep(6000);
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
