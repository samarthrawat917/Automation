package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LinkTest {
	WebDriver driver;
	
  @Test(priority=0)
  public void LINKTest() {
	  List<WebElement> HYlink = driver.findElements(By.tagName("a"));
	  System.out.println("HyperlinkCount..:"+HYlink.size());
  }
	  @Test(priority=1)
	  public void IMGTest() {
		  List<WebElement> IMGlink = driver.findElements(By.tagName("img"));
		  System.out.println("ImageHyperlinks are...:"+IMGlink.size());
  }
  @BeforeTest
  public void beforeMethod() throws InterruptedException {
	//init
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium"
					+ "\\Browser Driver\\chromedriver.exe");
	//instance
			WebDriver driver = new ChromeDriver();
			
	//request
			driver.get("http://www.irctc.com");
			Thread.sleep(5000);
  }

  @AfterTest
  public void afterMethod() {
	 driver.quit();
  }

}
