package Session_00;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser_00 {

	public static void main(String[] args) throws InterruptedException {
// init
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL"
				+ "\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
// instance
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediffmail.com");
		System.out.println("Title..:"+driver.getTitle());
		System.out.println("URL...:"+driver.getCurrentUrl());
		// System.out.println("PGSRC...:"+driver.getPageSource());
// 
		driver.navigate().to("http://www.yatra.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
// wait
		Thread.sleep(10000);
		driver.navigate().refresh();
// teardown
		//driver.quit();
		

		


	}

}
