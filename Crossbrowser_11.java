package TestNG_55;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Crossbrowser_11 {
	WebDriver driver;
	@Test (priority=0)
	public void uiTest() throws InterruptedException {
		driver.navigate().to("http://www.facebook.com");
		System.out.println("Title..:"+driver.getTitle());
		System.out.println("URL...:"+driver.getCurrentUrl());
		Thread.sleep(2000);
	}
	@Test (priority=1)
	public void hlinkTest() throws InterruptedException {
		driver.navigate().to("http://www.facebook.com");
		List<WebElement> Hylink = driver.findElements(By.tagName("a"));
		System.out.println("HyperlinkCount..:"+Hylink.size());
		Thread.sleep(2000);
	}
	@Test (priority=2)
	public void iminkTest() throws InterruptedException {
		driver.navigate().to("http://www.facebook.com");
		List<WebElement> IMlink = driver.findElements(By.tagName("img"));
		System.out.println("Imagelink....:"+IMlink.size());
		Thread.sleep(2000);
	}
	@BeforeMethod
	@Parameters("Browser")
	public void beforeTest(String Browser ) throws Exception {
		if (Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium\\Browser Driver\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else {
			throw new Exception("Browser is not working");
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);


	}

	@AfterMethod
	public void afterTest() {
		//driver.quit();
	}

}
